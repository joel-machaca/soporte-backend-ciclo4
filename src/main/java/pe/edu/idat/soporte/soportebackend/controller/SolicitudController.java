package pe.edu.idat.soporte.soportebackend.controller;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.soporte.soportebackend.dto.SolicitudDTO;
import pe.edu.idat.soporte.soportebackend.model.Solicitud;
import pe.edu.idat.soporte.soportebackend.service.ISolicitudService;
import java.util.List;


@RestController
@RequestMapping("/api/solicitud")
public class SolicitudController{

    private final ISolicitudService ISolicitudService;

    public SolicitudController(ISolicitudService ISolicitudService){
        this.ISolicitudService=ISolicitudService;
    }

    @GetMapping
    public ResponseEntity<List<Solicitud>> obtenerSolicitudes(){
        return ResponseEntity.ok(this.ISolicitudService.obtenerSolicitudes());
    }

    @PostMapping
    public ResponseEntity<SolicitudDTO> registrarSolicitud(@Valid @RequestBody SolicitudDTO solicitud){
        this.ISolicitudService.registrarSolicitud(solicitud);
        return ResponseEntity.status(HttpStatus.CREATED).body(solicitud);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Solicitud> consultarPorId(@PathVariable int id){
        return this.ISolicitudService.consultarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> actualizarSolicitud( @PathVariable Integer id, @Valid @RequestBody SolicitudDTO solicitudDto){
        this.ISolicitudService.actualizarSolicitud(id,solicitudDto);
        return ResponseEntity.ok("se actualizo correctamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarSolicitud(@PathVariable Integer id){
        this.ISolicitudService.eliminarSolicitud(id);
        return ResponseEntity.ok("solicitud eliminada ");
    }

}
