package com.bff.demo.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Bff para comunicação entre os microsserviços.")
                        .version("1.0")
                        .description("Microserviço só para se comunicar com os outros feito em SpringBoot")
                        .contact(new Contact()
                                .name("Rudge")
                        )
                );
    }
}
