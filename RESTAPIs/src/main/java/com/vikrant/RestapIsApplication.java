package com.vikrant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class RestapIsApplication {

	public static void main(String[] args) {
		System.out.println("Application starting");
		SpringApplication.run(RestapIsApplication.class, args);
		System.out.println("Running");
	}
	
	
}
