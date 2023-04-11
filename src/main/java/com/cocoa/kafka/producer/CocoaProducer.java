package com.cocoa.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CocoaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String message) {
        kafkaTemplate.send("cocoa-topic", message);
    }
}
