package com.vikrant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesApplication {

	public static void main(String[] args) {
		System.out.println("Application starting");
		SpringApplication.run(MicroservicesApplication.class, args);
		System.out.println("Application started");
	}

}
