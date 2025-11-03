package pe.edu.idat.soporte.soportebackend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info=@Info(
                title = "API DE SOLICITUDES",
                description ="API para gestionar solicitudes de soporte técnico: crear, consultar, actualizar y eliminar solicitudes.",
                version ="1.0.0",
                contact =@Contact(
                        name="repositorio",
                        url="https://github.com/joel-machaca/soporte-backend-ciclo4"
                )
        ),
        servers = @Server(
                description = "servidor de desarrollo",
                url="http://localhost:8080"
        )
)
public class SwaggerConfig {}
