package com.peppo.spring.creational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductBuilderTest {

    @Test
    void testBuilder() {
        Product product = new ProductBuilder()
            .setId("A")
            .setName("Iphone")
            .setSku("APP")
            .setPrice(20_000_000L)
            .build();
    }

    @Test
    void testBuilderLombok() {
        ProductLombok iphone = ProductLombok.builder()
            .name("Iphone 13")
            .id("A")
            .sku("APP")
            .price(20_000_000L)
            .category(Category.GADGET)
            .build();

        System.out.println(iphone);
    }
}