package examenbbdd.repository;

public interface RepoManager {
    DepartamentoRepository getDepartamentoRepository();
    EmpleadoRepository getEmpleadoRepository();

    DireccionRepository getDireccionRepository();
}
