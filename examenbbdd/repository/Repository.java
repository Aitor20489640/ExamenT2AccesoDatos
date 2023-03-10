package examenbbdd.repository;

import java.util.List;

public interface Repository<T, K> {
    List<T> findAll();
    T findById(K id);
    void save(T t);
    void update (T t);
    void deleteById(T t);
}
