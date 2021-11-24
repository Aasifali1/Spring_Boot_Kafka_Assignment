package com.knoldus.kup.kafka.consumer;


import com.knoldus.kup.kafka.service.ConsumerService;
import com.knoldus.kup.kafka.sender.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    @Autowired
    private ConsumerService consumerService;
    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        consumerService.addMessage(message);
        System.out.println(message);
    }
}