package com.helloworld.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/Greetings")
    public class HelloWorldController {
        @GetMapping
        public String printHelloWorld() {
            return "Greetings from First Application";
        }
    }

