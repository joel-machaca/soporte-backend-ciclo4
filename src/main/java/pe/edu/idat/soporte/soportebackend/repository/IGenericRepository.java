package pe.edu.idat.soporte.soportebackend.repository;

import pe.edu.idat.soporte.soportebackend.model.Solicitud;

import java.util.List;
import java.util.Optional;

public interface IGenericRepository<T>{
    List<T> findAll();
    void save(T solicitud);
    Optional<T> findById(Integer id);
    void update(T solicitud);
    void delete(Integer id);
}
