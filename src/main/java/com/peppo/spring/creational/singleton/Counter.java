package com.peppo.spring.creational.singleton;


import lombok.Data;

@Data
public class Counter {

    private Long value = 0L;

    public synchronized void increment() {
        value++;
    }
}
