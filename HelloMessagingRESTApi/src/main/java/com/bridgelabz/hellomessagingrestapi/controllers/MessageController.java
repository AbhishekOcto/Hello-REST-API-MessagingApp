package com.bridgelabz.hellomessagingrestapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/home")
    public String home(){
        return "Hello from BridgeLabz";
    }
}
