package pe.edu.idat.soporte.soportebackend.repository;

import org.springframework.stereotype.Repository;
import pe.edu.idat.soporte.soportebackend.dto.SolicitudDTO;
import pe.edu.idat.soporte.soportebackend.model.Solicitud;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SolicitudRepository implements ISolicitudRepository{
    private final List<Solicitud> bdSolicitud=new ArrayList<>();
    private final AtomicInteger secuencial =new AtomicInteger(0);


    @Override
    public List<Solicitud> findAll() {
        return bdSolicitud;
    }

    @Override
    public void save(Solicitud solicitud) {
        if(solicitud.getId()==null){
            solicitud.setId(secuencial.incrementAndGet());
        }
        bdSolicitud.add(solicitud);
    }

    @Override
    public Optional<Solicitud> findById(Integer id) {
        return bdSolicitud.stream()
                .filter(solicitud -> solicitud.getId().equals(id))
                .findFirst();
    }

    @Override
    public void update(Solicitud solicitud) {
        for(int i=0;i<bdSolicitud.size();i++){
            if (bdSolicitud.get(i).getId().equals(solicitud.getId())){
                bdSolicitud.set(i,solicitud);
                break;
            }
        }
    }

    @Override
    public void delete(Integer id) {
        bdSolicitud.removeIf(solicitud -> solicitud.getId().equals(id));
    }
}
