package pe.edu.idat.soporte.soportebackend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Soporte Técnico")
                        .version("1.0")
                        .description("Documentación de endpoints del sistema de soporte técnico"));
    }


}
