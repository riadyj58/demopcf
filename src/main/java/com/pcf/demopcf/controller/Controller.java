package com.pcf.demopcf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @GetMapping("/")
    public String helloWorld()
    {
        return "Hello World";
    }
    @GetMapping("/hi")
    public String hi()
    {
        return "Hi";
    }
}