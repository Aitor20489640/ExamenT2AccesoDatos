package examenbbdd.repository;

import examenbbdd.models.Direccion;
import examenbbdd.models.Empleado;

public interface DireccionRepository extends Repository<Direccion, Long> {
    public Direccion findByKey(String key, Object value);
}
