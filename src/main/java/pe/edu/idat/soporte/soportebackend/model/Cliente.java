package pe.edu.idat.soporte.soportebackend.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente extends Persona{
    public Cliente(int id, String dni, String nombre, String apellido, String email, String telefono) {
        super(id, dni, nombre, apellido, email, telefono);
    }
}
