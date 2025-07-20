package com.peppo.spring.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        Employee haris = applicationContext.getBean("employeeManager", Employee.class);
        haris.setName("haris");

        Employee bagus = applicationContext.getBean("employeeStaff", Employee.class);
        bagus.setName("bagus");

        Employee ahmad =  applicationContext.getBean("employeeVicePresident", Employee.class);
        ahmad.setName("ahmad");

        System.out.println(haris);
        System.out.println(bagus);
        System.out.println(ahmad);
    }
}