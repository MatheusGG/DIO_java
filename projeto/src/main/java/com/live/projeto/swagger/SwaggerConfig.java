package com.live.projeto.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiAdmin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dio.backdend"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo())
                .globalOperationParameters(
                        Collections.singletonList(
                                new ParameterBuilder()
                                        .name("Authorization")
                                        .description("Header para Token JWI")
                                        .modelRef(new ModelRef("string"))
                                        .parameterType("header")
                                        .required(false)
                                        .build()
                        )
                );
    }

    @Bean
    public Apinfo apinfo() {
        return new ApiInfoBuilder()
                .title("API-REST")
                .description("Api_para_gerenciamento_de_ponto_e_acesso.")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/license/LICESE-2.0")
                .contact(new Contact("DIO", "https://www.dio.me/", "contato@digitalinnovationone.com.br"))
                .build();
    }
}
