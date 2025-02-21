package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Message {

    public String greeting() {
        return  "Welcome to Azure";
    }
}
