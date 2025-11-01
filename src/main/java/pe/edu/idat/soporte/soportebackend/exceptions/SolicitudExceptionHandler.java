package pe.edu.idat.soporte.soportebackend.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.util.List;

@RestControllerAdvice
public class SolicitudExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handlerMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest req){
        List<String> errores=ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error->error.getField()+": "+ error.getDefaultMessage())
                .toList();

        ErrorResponse showError =ErrorResponse.builder()
                .fechaError(LocalDate.now())
                .status(HttpStatus.BAD_REQUEST.value())
                .error("campos vacios")
                .mensaje(errores.toString())
                .path(req.getDescription(false))
                .build();
        return ResponseEntity.badRequest().body(showError);
    }

}
