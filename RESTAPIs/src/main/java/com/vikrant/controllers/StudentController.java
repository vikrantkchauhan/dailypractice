package com.vikrant.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class StudentController {

	@GetMapping
	public String getUsers() {
		return "Get request called";
	}

	@GetMapping(path = "/UserID")
	public String getUser(@PathVariable String userid) {

		return "Single student info returned"+userid;

	}
	
	@GetMapping
	public String getUserQueryparam(@RequestParam(value="page") int page, @RequestParam(value="limit") int limit){
		
		return "Page requested are"+page+"Limit is:"+limit;
		
	}

	@PostMapping
	public String postUsers() {
		return "Post mapping called";
	}

	@PutMapping
	public String putUsers() {
		return "Put mapping called";
	}

	@DeleteMapping
	public String deleteMapping() {
		return "Delete mapping called";
	}

}
