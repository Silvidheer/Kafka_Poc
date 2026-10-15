package com.example.Kafkapoc.producer;

import com.example.Kafkapoc.model.Employee;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProducer {

    private static final String TOPIC = "test-topic";

    private final KafkaTemplate<String, Employee> kafkaTemplate;

    public EmployeeProducer(KafkaTemplate<String, Employee> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEmployee(Employee employee) {

        kafkaTemplate.send(TOPIC, employee);

        System.out.println("Employee sent: " + employee);
    }
}