package com.producer.producer.controller;

import com.producer.producer.model.RiderLocation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducerRestController {
    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    public KafkaProducerRestController(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        RiderLocation riderLocation = new RiderLocation(1L, 68.09, 78.33);
        kafkaTemplate.send("my-topic", riderLocation);
        return "Message " + message + " sent successfully";
    }
}
