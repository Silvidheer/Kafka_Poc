package com.example.Kafkapoc.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {

    private Long id;
    private String name;
    private String department;

    public Employee() {
    }

    public Employee(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}