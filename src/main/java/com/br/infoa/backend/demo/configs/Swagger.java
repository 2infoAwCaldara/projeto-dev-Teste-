package com.br.infoa.backend.demo.configs;

public class Swagger {
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "ProjetoDev API",
        version = "1.0",
        description = "Uma software house foi contratada para desenvolver uma API de recrutamento e seleção, ela dev criar uma aplicação que permita consultas em tres entidades (Empresa, candidato e vaga) e cadastrar empresas pelo Swagger."
    )
)
public class Swagger {
}
}