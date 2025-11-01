package pe.edu.idat.soporte.soportebackend.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {


//    @Positive(message = "El id debe ser mayor a 0")
    private int id;

    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 dígitos.")
    private String dni;

    @NotBlank(message = "el nombre es obligatorio")
    @Size(min = 2 ,max = 60, message = "El nombre debe tener entre 2 y 60 caracteres")
    private String nombre;

    @NotBlank(message = "el apellido es obligatorio")
    @Size(min = 2 ,max = 40, message = "tu apellido puede tener entre 2 y 40 caracteres")
    private String apellido;

    @Email(message = "el correo debe ser valido")
    private String email;

    @Pattern(regexp = "\\d{9}",message = "El telefono debe tener 9 digitos")
    private String telefono;
}
