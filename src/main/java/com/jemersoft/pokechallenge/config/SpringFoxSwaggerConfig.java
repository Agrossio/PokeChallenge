package com.jemersoft.pokechallenge.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringFoxSwaggerConfig {

//    https://springdoc.org/#migrating-from-springfox
//    swagger con https: https://github.com/springdoc/springdoc-openapi/issues/118
    @Bean
    public OpenAPI api(){
        return new OpenAPI()
                .info(new Info()
                        .title("PokeChallenge Springboot API")
                        .version("V1")
                        .description("""
                               Challenge for a Software Engineer position. We look forward to evaluate:
                                - External API integration.
                                - Expose an API using Java Spring Boot.
                                - Implement Swagger.
                                - Deploy to the cloud.
                                - Exception handling.
                                - Clean and quality code.
                                """)
                        .contact(new Contact().name("Matias Abossio").url("https://www.matiabossio.com.ar/").email("abossio@gmail.com"))
                        .termsOfService("https://swagger.io/terms/")
                        .license(new License().name("GitHub Repository").url("https://github.com/Agrossio/pokechallenge"))
                        );
    }
}
