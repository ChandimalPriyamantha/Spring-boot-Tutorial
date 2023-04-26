package com.example.thymeleaf.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String iteration(Model model){
        List<Employee> employees = new ArrayList<>();


        employees.add(new Employee("Chandimal","Priyamantha","chandi@gmail.com"));
        employees.add(new Employee("Yamini","Mal","Yamini@gmail.com"));
        employees.add(new Employee("Kusal","Mendis","kusal@gmail.com"));
        employees.add(new Employee("Tharidu","Gamage","tharidu@gmail.com"));
        model.addAttribute("employees",employees);
        return "iteration";
    }
}
