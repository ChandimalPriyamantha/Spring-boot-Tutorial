package com.example.demo_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

    @GetMapping("/student")
    public String helloWorld(){

        return "Hello World.";
    }

}
