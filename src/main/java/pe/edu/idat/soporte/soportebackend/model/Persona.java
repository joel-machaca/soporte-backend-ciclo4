package pe.edu.idat.soporte.soportebackend.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {



    private int id;


    private String dni;


    private String nombre;


    private String apellido;


    private String email;


    private String telefono;
}
