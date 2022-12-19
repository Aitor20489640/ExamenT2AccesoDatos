package examenbbdd.repository.impl;

import com.zaxxer.hikari.HikariDataSource;
import examenbbdd.models.Departamento;
import examenbbdd.models.Direccion;
import examenbbdd.repository.DireccionRepository;
import examenbbdd.repository.EmpleadoRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DireccionRepositoryImpl implements DireccionRepository {

    final String FINDALL = "SELECT * FROM direcciones";
    final String FINDBYKEY = "SELECT * FROM direcciones WHERE %s = ?";
    final String SAVE = "INSERT INTO direcciones (empleado_id, calle, ciudad, pais) VALUES (?, ?, ?, ?)";
    final String UPDATE = "UPDATE direcciones SET empleado_id = ?, calle = ?, ciudad = ?, pais = ? WHERE id = ?";
    final String DELETE = "DELETE FROM direcciones WHERE id = ?";

    private HikariDataSource dataSource;
    private RepoManagerImpl repoManager;

    public DireccionRepositoryImpl(HikariDataSource dataSource) {
        this.dataSource = dataSource;
        repoManager = new RepoManagerImpl();
    }

    @Override
    public List<Direccion> findAll() {
        List<Direccion> direccions = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(FINDALL, PreparedStatement.RETURN_GENERATED_KEYS);
            ResultSet rs = sentencia.executeQuery()){
            if (rs.next()) {
                direccions.add(convertToDirecion(rs));
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return direccions;
    }

    @Override
    public Direccion findById(Long id) {
        Direccion direccion = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(String.format(FINDBYKEY, "id"), PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setLong(1, id);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                direccion = convertToDirecion(rs);
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return direccion;

    }

    @Override
    public Direccion findByKey(String key, Object value) {
        Direccion direccion = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(String.format(FINDBYKEY, key), PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setObject(1, value);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                direccion = convertToDirecion(rs);
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return direccion;
    }

    @Override
    public void save(Direccion direccion) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(SAVE, PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setLong(1, direccion.getEmpleado().getId());
            sentencia.setString(2, direccion.getCalle());
            sentencia.setString(3, direccion.getCiudad());
            sentencia.setString(4, direccion.getPais());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void update(Direccion direccion) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(UPDATE, PreparedStatement.RETURN_GENERATED_KEYS)){
            new RepoManagerImpl().getEmpleadoRepository().update(direccion.getEmpleado());
            sentencia.setLong(1, direccion.getEmpleado().getId());
            sentencia.setString(2, direccion.getCalle());
            sentencia.setString(3, direccion.getCiudad());
            sentencia.setString(4, direccion.getPais());
            sentencia.setLong(5, direccion.getId());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void deleteById(Direccion direccion) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(DELETE, PreparedStatement.RETURN_GENERATED_KEYS)){
            new RepoManagerImpl().getEmpleadoRepository().deleteById(direccion.getEmpleado());
            sentencia.setLong(1, direccion.getId());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    private Direccion convertToDirecion(ResultSet rs) throws SQLException {
        return new Direccion(
                rs.getLong("id"),
                repoManager.getEmpleadoRepository().findById(rs.getLong("empleado_id")),
                rs.getString("calle"),
                rs.getString("ciudad"),
                rs.getString("pais")
        );
    }
}
