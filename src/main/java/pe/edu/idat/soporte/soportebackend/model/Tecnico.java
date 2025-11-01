package pe.edu.idat.soporte.soportebackend.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Tecnico extends Persona{
    public Tecnico(int id, String dni, String nombre, String apellido, String email, String telefono, String especialidad) {
        super(id, dni, nombre, apellido, email, telefono);
        this.especialidad = especialidad;
    }

    @NotBlank(message = "La especialidad es obligatoria")
    @Size(min = 2 ,max = 100, message = "La especialidad debe tener entre 5 y 100 caracteres")
    private String especialidad;


}
