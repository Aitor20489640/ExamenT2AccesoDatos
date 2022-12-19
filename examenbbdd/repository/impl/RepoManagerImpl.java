package examenbbdd.repository.impl;

import examenbbdd.repository.*;

public class RepoManagerImpl implements RepoManager {

    private Hikari connectionPool;

    private DepartamentoRepository deptRepo = null;
    private EmpleadoRepository empleadoRepo = null;
    private DireccionRepository direccionRepo = null;

    public RepoManagerImpl() {
        this.connectionPool = new Hikari();
    }

    @Override
    public DepartamentoRepository getDepartamentoRepository() {
        if (deptRepo == null) {
            deptRepo = new DepartamentoRepositoryImpl(connectionPool.getDataSource());
        }
        return deptRepo;
    }

    @Override
    public EmpleadoRepository getEmpleadoRepository() {
        if (empleadoRepo == null) {
            empleadoRepo = new EmpleadoRepositoryImpl(connectionPool.getDataSource());
        }
        return empleadoRepo;
    }

    @Override
    public DireccionRepository getDireccionRepository() {
        if (direccionRepo == null) {
            direccionRepo = new DireccionRepositoryImpl(connectionPool.getDataSource());
        }
        return direccionRepo;
    }
}
