package com.example.consumer;

import com.example.consumer.model.RiderLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
//    @KafkaListener(topics = "my-topic", groupId = "my-group")
//    public void listen(RiderLocation riderLocation) {
//        System.out.println("Received: " + riderLocation);
//    }
}
