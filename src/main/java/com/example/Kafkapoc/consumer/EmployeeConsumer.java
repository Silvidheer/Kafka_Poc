package com.example.Kafkapoc.consumer;

import com.example.Kafkapoc.model.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConsumer {

    @KafkaListener(
            topics = "test-topic",
            groupId = "employee-group"
    )
    public void consume(Employee employee) {

        System.out.println("Employee received: " + employee);
    }
}