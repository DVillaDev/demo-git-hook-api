package com.demo.hook.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello my beautiful world!!!!";
    }

    @GetMapping
    @RequestMapping("/bye")
    public String byeWorld(){
        return "Bye again my world!";
    }

}
