package com.cocoa.kafka.controller;

import com.cocoa.kafka.producer.CocoaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final CocoaProducer cocoaProducer;

    @PostMapping("send-message")
    public void sendMessage(@RequestBody String body) {
        cocoaProducer.sendMessage(body);
    }
}
