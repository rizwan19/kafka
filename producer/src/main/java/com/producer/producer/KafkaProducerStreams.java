package com.producer.producer;

import com.producer.producer.model.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
import java.util.function.Supplier;
@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendLocation(){
        return () -> {
            long random = new Random().nextInt(1000);
          RiderLocation location = new RiderLocation(random, 55.89, 22.43);
            System.out.println("Sending Rider Location: " + location);
            return location;
        };
    }
}
