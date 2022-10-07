package com.bridgelabz.hellomessagingrestapi.controllers;


import com.bridgelabz.hellomessagingrestapi.entity.User;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/hello")
    public String getFirstLastName(@RequestBody User user){
        return "Hello "+ user.getFirstName() +" "+ user.getLastName() +" from Bridgelabz";
    }
    /*{
    "firstName": "Mark",
    "lastName": "Taylor"
    }
    Hello Mark Taylor from Bridgelabz*/

    @PutMapping("/hello/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + " from Bridgelabz";
    }
    //http://localhost:8083/hello/put/Mark?lastName=Taylor

}
