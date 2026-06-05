package com.example.spring_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/")
    public String handleRoot() {
        return "<h1> Hello From Spring Server!</h1>";
    }
}