package examenbbdd.repository;

import examenbbdd.models.Empleado;

public interface EmpleadoRepository extends Repository<Empleado, Long>{
    public Empleado findByKey(String key, Object value);
}
