package examenbbdd.repository;

import examenbbdd.models.Departamento;

public interface DepartamentoRepository extends Repository<Departamento, Long> {
    public Departamento findByKey(String key, Object value);
}
