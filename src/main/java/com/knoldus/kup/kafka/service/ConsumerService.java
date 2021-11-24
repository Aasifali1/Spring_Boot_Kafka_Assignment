package com.knoldus.kup.kafka.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerService {
    private List<String> list = new ArrayList<>();
    public void addMessage(String message){
        list.add(message);
    }
    public String getAllMessages(){
        return this.list.toString();
    }
}
