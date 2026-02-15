package com.iitu.Student.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {

        return "Hello, Spring Boot!";
    }

    @GetMapping("/greeting")
    public String greeting() {

        return "Welcome to Web Component Development!";
    }
}
