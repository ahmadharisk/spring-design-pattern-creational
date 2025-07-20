package com.peppo.spring.creational.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public ProductLombok productGadget() {
        return ProductLombok.builder()
            .category(Category.GADGET)
            .build();
    }

    @Bean
    @Scope("prototype")
    public ProductLombok productFashion() {
        return ProductLombok.builder()
            .category(Category.FASHION)
            .build();
    }
}
