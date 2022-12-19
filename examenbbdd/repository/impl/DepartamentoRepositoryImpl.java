package examenbbdd.repository.impl;


import com.zaxxer.hikari.HikariDataSource;
import examenbbdd.models.Departamento;
import examenbbdd.repository.DepartamentoRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoRepositoryImpl implements DepartamentoRepository {

    final String FINDALL = "SELECT * FROM departamentos";
    final String FINDBYID = "SELECT * FROM departamentos WHERE id = ?";
    final String SAVE = "INSERT INTO departamentos (id, nombre) VALUES (?, ?)";
    final String UPDATE = "UPDATE departamentos SET nombre = ? WHERE id = ?";
    final String DELETE = "DELETE FROM departamentos WHERE id = ?";

    private HikariDataSource dataSource;

    public DepartamentoRepositoryImpl(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Departamento> findAll() {
        List<Departamento> departamentos = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(FINDALL, PreparedStatement.RETURN_GENERATED_KEYS);
             ResultSet rs = sentencia.executeQuery()){
            while (rs.next()) {
                departamentos.add(convertToDepartamento(rs));
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return departamentos;
    }

    @Override
    public Departamento findById(Long id) {
        Departamento departamento = null;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(FINDBYID, PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setLong(1, id);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                departamento = convertToDepartamento(rs);
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return departamento;
    }

    @Override
    public void save(Departamento departamento) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(SAVE, PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setLong(1, departamento.getId());
            sentencia.setString(2, departamento.getNombre());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void update(Departamento departamento) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(UPDATE, PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setString(1, departamento.getNombre());
            sentencia.setLong(2, departamento.getId());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement sentencia = connection.prepareStatement(DELETE, PreparedStatement.RETURN_GENERATED_KEYS)){
            sentencia.setLong(1, id);
            sentencia.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    private Departamento convertToDepartamento(ResultSet rs) throws SQLException {
        return new Departamento(
                rs.getInt("id"),
                rs.getString("nombre")
        );
    }
}
