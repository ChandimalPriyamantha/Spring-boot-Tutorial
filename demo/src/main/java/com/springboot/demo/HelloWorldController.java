package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody //use HTTP Message converters to convert the return value to HTTP response body
//get
//post
//put
//delete
@RestController
public class HelloWorldController {
    // GET HTTP Method
    // http://localhost:8080/hello-world
    @GetMapping("/hello")
   public  String helloWorld(){
       return "Hello World";
   }
}
