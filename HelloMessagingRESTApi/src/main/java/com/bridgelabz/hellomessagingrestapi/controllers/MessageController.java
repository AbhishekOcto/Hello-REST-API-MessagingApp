package com.bridgelabz.hellomessagingrestapi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/home")
    public String home(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello "+name+" From BridgeLabz";
    }
    //localhost:8083/query?name=Mark

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello " +name+ " from Bridgelabz";
    }
   // localhost:8083/hello/{Mark}

}
