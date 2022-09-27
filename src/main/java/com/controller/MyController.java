package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value="/")
    public String greeting() { return "Welcome to Wayne Ryan's assessment: CI/CD Deployment of a Springboot Application.";}

    @GetMapping(value = "hello/{name}")
    public String helloYou(@PathVariable("name")String name){
        return name + "Welcome!";
    }
}
