package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {
    private Message message;

   @Autowired
    public MessageController(Message message) {
        this.message = message;
    }
    @GetMapping("/")
    public String greet() {
       return message.greeting();
    }
}
