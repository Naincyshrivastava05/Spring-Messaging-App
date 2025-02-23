package com.spring_messaging_app.MessagingAppApplicaton;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessageController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String sayHello1(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}