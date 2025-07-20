package com.peppo.spring.creational.builder;

import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
public class ProductLombok {
    private String id;
    private String name;
    private String sku;
    private Long price;
    private Category category;

    @Override
    public String toString() {
        return "ProductLombok{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", sku='" + sku + '\'' +
            ", price=" + price +
            ", category=" + category +
            '}';
    }
}
