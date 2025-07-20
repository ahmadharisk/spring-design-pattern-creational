package com.peppo.spring.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
    private String id;
    private String name;
    private Position position;
    private Long salary;

    @Override
    public String toString() {
        return "Employee{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", position=" + position +
            ", salary=" + salary +
            '}';
    }
}
