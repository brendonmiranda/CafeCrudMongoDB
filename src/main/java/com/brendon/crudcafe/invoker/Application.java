package com.brendon.crudcafe.invoker;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication(
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
    basePackages = {
            "com.brendon.crudcafe.invoker",
            "com.brendon.crudcafe.api",
            "com.brendon.crudcafe.configuration",
            "com.brendon.crudcafe.repository",
            "com.brendon.crudcafe.service"

    },
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "com.brendon.crudcafe.invoker.OpenApiGeneratorApplication.jsonNullableModule")
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}