package pe.edu.idat.soporte.soportebackend.exceptions;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder

public class ErrorResponse {
    private LocalDate fechaError;
    private int status;
    private String error;
    private String mensaje;
    private String path;
}
