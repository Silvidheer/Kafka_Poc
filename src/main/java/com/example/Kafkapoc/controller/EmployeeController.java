package com.example.Kafkapoc.controller;

import com.example.Kafkapoc.model.Employee;
import com.example.Kafkapoc.producer.EmployeeProducer;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeProducer employeeProducer;

    public EmployeeController(EmployeeProducer employeeProducer) {
        this.employeeProducer = employeeProducer;
    }

    @PostMapping("/employees")
    public String sendEmployee(@RequestBody Employee employee) {

        employeeProducer.sendEmployee(employee);

        return "Employee sent successfully";
    }
}