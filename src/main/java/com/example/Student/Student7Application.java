package com.example.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Student7Application {

	public static void main(String[] args) {
		SpringApplication.run(Student7Application.class, args);
	}

}
