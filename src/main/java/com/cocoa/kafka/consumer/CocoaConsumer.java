package com.cocoa.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CocoaConsumer {

    @KafkaListener(topics = "cocoa-topic", groupId = "foo")
    public void consumer(final String message) {
        System.out.println("consumer " + message);
    }
}
