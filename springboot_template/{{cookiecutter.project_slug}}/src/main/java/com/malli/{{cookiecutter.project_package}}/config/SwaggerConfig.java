package com.malli.{{ cookiecutter.project_package }}.config;

import com.malli.{{ cookiecutter.project_package }}.controller.{{ cookiecutter.entity }}Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage({{ cookiecutter.entity }}Controller.class.getPackageName()))
                .paths(PathSelectors.any())
                .build();
    }
}
