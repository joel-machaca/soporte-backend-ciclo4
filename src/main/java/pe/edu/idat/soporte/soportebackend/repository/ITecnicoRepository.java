package pe.edu.idat.soporte.soportebackend.repository;

import pe.edu.idat.soporte.soportebackend.model.Solicitud;
import pe.edu.idat.soporte.soportebackend.model.Tecnico;

import java.util.List;
import java.util.Optional;

public interface ITecnicoRepository{
//    List<Tecnico> findAll();
//    void save(Tecnico solicitud);
    Optional<Tecnico> findById(Integer id);
//    void update(Tecnico solicitud);
//    void delete(Integer id);
}
