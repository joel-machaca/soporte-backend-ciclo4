package pe.edu.idat.soporte.soportebackend.service;

import pe.edu.idat.soporte.soportebackend.dto.SolicitudDTO;
import pe.edu.idat.soporte.soportebackend.model.Solicitud;

import java.util.List;
import java.util.Optional;

public interface ISolicitudService {
    List<Solicitud> obtenerSolicitudes();
    void registrarSolicitud(SolicitudDTO solicitud);
    Optional<Solicitud> consultarPorId(int id);
    void actualizarSolicitud(Integer id,SolicitudDTO solicituddto);
    void eliminarSolicitud(Integer id);
}
