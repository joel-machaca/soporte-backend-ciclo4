package pe.edu.idat.soporte.soportebackend.service;
import org.springframework.stereotype.Service;
import pe.edu.idat.soporte.soportebackend.dto.SolicitudDTO;
import pe.edu.idat.soporte.soportebackend.model.Cliente;
import pe.edu.idat.soporte.soportebackend.model.EstadoSolicitud;
import pe.edu.idat.soporte.soportebackend.model.Solicitud;

import pe.edu.idat.soporte.soportebackend.model.Tecnico;
import pe.edu.idat.soporte.soportebackend.repository.ClienteRepository;
import pe.edu.idat.soporte.soportebackend.repository.SolicitudRepository;
import pe.edu.idat.soporte.soportebackend.repository.TecnicoRepository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SolicitudService implements ISolicitudService{
    private final SolicitudRepository SolicitudRepo;
    private final TecnicoRepository TecnicoRepo;
    private final ClienteRepository ClienteRepo;

    public SolicitudService(SolicitudRepository SolicitudRepo, TecnicoRepository TecnicoRepo, ClienteRepository ClienteRepo) {
        this.SolicitudRepo = SolicitudRepo;
        this.TecnicoRepo = TecnicoRepo;
        this.ClienteRepo = ClienteRepo;
    }

    @Override
    public List<Solicitud> obtenerSolicitudes() {
        return this.SolicitudRepo.findAll();
    }

    @Override
    public void registrarSolicitud(SolicitudDTO solicituddto) {

        Tecnico t1=TecnicoRepo.findById(solicituddto.getIdTecnico()).orElseThrow(()->new RuntimeException("tecnico no encontrado"));
        Cliente c1=ClienteRepo.findById(solicituddto.getIdCliente()).orElseThrow(()->new RuntimeException("cliente no encontrado"));

        Solicitud s =Solicitud.builder()
                .titulo(solicituddto.getTitulo())
                .descripcion(solicituddto.getDescripcion())
                .cliente(c1)
                .tecnico(t1)
                .fechaCreacion(LocalDate.now())
                .estado(EstadoSolicitud.PENDIENTE)
                .build();
        this.SolicitudRepo.save(s);
    }

    @Override
    public Optional<Solicitud> consultarPorId(int id) {
        return this.SolicitudRepo.findById(id);
    }

    @Override
    public void actualizarSolicitud(SolicitudDTO solicituddto) {
        Tecnico t1 = TecnicoRepo.findById(solicituddto.getIdTecnico()).orElseThrow(() -> new RuntimeException("tecnico no encontrado"));
        Cliente c1 = ClienteRepo.findById(solicituddto.getIdCliente()).orElseThrow(() -> new RuntimeException("cliente no encontrado"));

        Solicitud s = Solicitud.builder()
                .titulo(solicituddto.getTitulo())
                .descripcion(solicituddto.getDescripcion())
                .cliente(c1)
                .tecnico(t1)
                .build();
        this.SolicitudRepo.update(s);
    }
    @Override
    public void eliminarSolicitud(Integer id) {
        this.SolicitudRepo.delete(id);
    }
}
