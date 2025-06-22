package com.example.consumer;

import com.example.consumer.model.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class GenericConsumer {
    @Bean
    public Consumer<RiderLocation> processRiderLocation(){
        return riderLocation -> {
            System.out.println("Received Rider Location: " + riderLocation);
        };
    }
}
