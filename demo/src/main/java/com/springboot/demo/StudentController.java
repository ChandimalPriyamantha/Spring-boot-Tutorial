package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http://localhost:8080/studnet
    @GetMapping("/student")
    public Student getStudent(){
        return  new Student("Chandimal", "Priyamantha");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tharuka","Yamini"));
        students.add(new Student("Tharuka","Yamini"));
        students.add(new Student("Tharuka","Yamini"));
        students.add(new Student("Tharuka","Yamini"));
        students.add(new Student("Tharuka","Yamini"));

        return  students;
    }


    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }

    //build rest API to handle query parameters
    //http://localhost:8080/student?firstName=Ramesh&lastName=Fadatare

    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name="firstName") String firstName,
            @RequestParam(name="lastName") String lastName){
        return new Student(firstName,lastName);
    }
}
