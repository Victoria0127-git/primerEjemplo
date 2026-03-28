package edu.itm.ejemplo.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentationConfig {

    @Bean
    public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(
            new io.swagger.v3.oas.models.info.Info()
                .title("API de ejemplo para el curso de programación con Spring Boot")
                .version("0.0.1")
                .description("Esta API nos permite hacer pruebas de nuestros end points")
                .contact(new Contact().name("el profe").email("elprofe@elprofe.com")));
    }
}
