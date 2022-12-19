package examenbbdd.repository.impl;

import examenbbdd.repository.DepartamentoRepository;
import examenbbdd.repository.Hikari;
import examenbbdd.repository.RepoManager;

public class RepoManagerImpl implements RepoManager {

    private Hikari connectionPool;

    private DepartamentoRepositoryImpl deptRepo = null;

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
}
