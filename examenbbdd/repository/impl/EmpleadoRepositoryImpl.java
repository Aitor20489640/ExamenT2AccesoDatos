package examenbbdd.repository.impl;

import com.zaxxer.hikari.HikariDataSource;
import examenbbdd.models.Departamento;
import examenbbdd.models.Empleado;
import examenbbdd.repository.DireccionRepository;
import examenbbdd.repository.EmpleadoRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    final String FINDALL = "SELECT * FROM empleados inner join direcciones d on empleados.id = d.empleado_id";
    final String FINDBYKEY = "SELECT * FROM empleados inner join direcciones d on empleados.id = d.empleado_id WHERE %s = ?";
    final String SAVE = "INSERT INTO empleados (nombre, apellido, email, sueldo) VALUES (?, ?, ?, ?)";
    final String UPDATE = "UPDATE empleados SET nombre = ?, apellido = ?, email = ?, sueldo = ? WHERE id = ?";
    final String DELETE = "DELETE FROM empleados WHERE id = ?";

    private HikariDataSource dataSource;
    private RepoManagerImpl repoManager;

    public EmpleadoRepositoryImpl(HikariDataSource dataSource) {
        this.dataSource = dataSource;
        repoManager = new RepoManagerImpl();
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(FINDALL, PreparedStatement.RETURN_GENERATED_KEYS);
             ResultSet rs = sentencia.executeQuery()){
            while (rs.next()) {
                empleados.add(convertToEmpleado(rs));
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return empleados;
    }

    @Override
    public Empleado findById(Long id) {
        Empleado empleado = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(FINDALL, PreparedStatement.RETURN_GENERATED_KEYS)){
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                empleado = convertToEmpleado(rs);
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return empleado;
    }

    @Override
    public Empleado findByKey(String key, Object value) {
        Empleado empleado = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(String.format(FINDBYKEY, key), PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setObject(1, value);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                empleado = convertToEmpleado(rs);
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return empleado;
    }

    @Override
    public void save(Empleado empleado) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(SAVE, PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setString(1, empleado.getNombre());
            sentencia.setString(2, empleado.getApellido());
            sentencia.setString(3, empleado.getEmail());
            sentencia.setDouble(4, empleado.getSueldo());
            sentencia.executeUpdate();
            new RepoManagerImpl().getDireccionRepository().save(empleado.getDireccion());
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void update(Empleado empleado) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(UPDATE, PreparedStatement.RETURN_GENERATED_KEYS)){
            new RepoManagerImpl().getDireccionRepository().update(empleado.getDireccion());
            sentencia.setString(1, empleado.getNombre());
            sentencia.setString(2, empleado.getApellido());
            sentencia.setString(3, empleado.getEmail());
            sentencia.setDouble(4, empleado.getSueldo());
            sentencia.setLong(5, empleado.getId());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void deleteById(Empleado empleado) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(DELETE, PreparedStatement.RETURN_GENERATED_KEYS)){
            new RepoManagerImpl().getDireccionRepository().deleteById(empleado.getDireccion());
            sentencia.setLong(1, empleado.getId());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    private Empleado convertToEmpleado(ResultSet rs) throws SQLException {
        return new Empleado(
                rs.getLong("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("email"),
                rs.getDouble("sueldo"),
                repoManager.getDireccionRepository().findById(rs.getLong("d.id"))
        );
    }
}
