package com.vikrant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikrant.service.StudentService;

@RestController

public class LoginController {
	
	@Autowired
	private StudentService sts; 
	
	@PostMapping("/login")
	public String login() {
		
		
		return "Login Successfully";
		
	}
	
	

}
