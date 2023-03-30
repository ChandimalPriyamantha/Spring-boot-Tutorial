package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello World..!");
		Student_Tharu tharu = new Student_Tharu();
		tharu.setFirstName("Yamini");
		tharu.setId(1);

		System.out.println(tharu.getFirstName() + tharu.getId());
	}

}
