package pe.edu.idat.soporte.soportebackend.repository;

import pe.edu.idat.soporte.soportebackend.model.Solicitud;

import java.util.List;
import java.util.Optional;

public interface IGenericRepository<T>{
    List<T> buscarTodo();
    void guardar(T solicitud);
    Optional<T> buscarPorId(Integer id);
    void actualizar(T solicitud);
    void eliminar(Integer id);
}
