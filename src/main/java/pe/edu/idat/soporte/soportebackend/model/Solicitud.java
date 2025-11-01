package pe.edu.idat.soporte.soportebackend.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {
    private Integer id;

    @NotBlank(message = "El titulo es obligatorio")
    @Size(min = 3, max = 50,message = "el titulo debe tener entre 3 y 50 caracteres")
    private String titulo;

    @NotBlank(message = "La descripcion es obligratoria")
    @Size(min=3,max = 200,message = "la descripcion debe tener entre 3 a 200 caracteres")
    private String descripcion;

    @NotNull(message = "Debe asignar un cliente")
    private Cliente cliente;

    @NotNull(message = "Debe asignar un tecnico")
    private Tecnico tecnico;

    private EstadoSolicitud estado;

    private LocalDate fechaCreacion;


}
