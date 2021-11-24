package com.knoldus.kup.kafka.controllers;

import com.knoldus.kup.kafka.service.ConsumerService;
import com.knoldus.kup.kafka.sender.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
//
//    @Autowired
//    KafkaTemplate<String, String> kafkaTemplate ;

    @Autowired
    ConsumerService consumerService;

    @Autowired
    private final Producer producer;

    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/publish/{message}")
    public String sendMessageToKafkaTopic(@PathVariable("message") String message) {
        consumerService.addMessage(message);
        return this.producer.sendMessage(message);
    }

    @RequestMapping("/allMessages")
    public String getAll() {
        return consumerService.getAllMessages();
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}