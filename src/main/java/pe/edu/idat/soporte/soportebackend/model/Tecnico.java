package pe.edu.idat.soporte.soportebackend.model;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Tecnico extends Persona{
    public Tecnico(int id, String dni, String nombre, String apellido, String email, String telefono, String especialidad) {
        super(id, dni, nombre, apellido, email, telefono);
        this.especialidad = especialidad;
    }

    private String especialidad;


}
