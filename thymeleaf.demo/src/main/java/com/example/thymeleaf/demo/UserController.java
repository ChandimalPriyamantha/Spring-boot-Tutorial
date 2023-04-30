package com.example.thymeleaf.demo;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {


    @GetMapping("/if-unless")
    public String users(Model model){
        List<Users> users = new ArrayList<>();
        users.add(new Users("Ramesh","remesh@gmail.com","ADMIN"));
        users.add(new Users("Ramesh","remesh@gmail.com","USER"));
        users.add(new Users("Ramesh","remesh@gmail.com","USER"));
        model.addAttribute("users",users);
        return "if-unless";

        }
    @GetMapping("/switch-case")
    public String switchExample(Model model){
        Users user = new Users("Ramesh" , "Ramesh@gmail.cm","ADMIN");
        model.addAttribute("user",user);
        return "switch-case";
    }
}
