package com.vikrant.service;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
	
	
	String json = "{\r\n"
			+ "\"name\":\"Vikrant\"\r\n"
			+ "\"id\":\"1001\"\r\n"
			+ "\"city\":\"Noorpur\"\r\n"
			+ "\r\n"
			+ "}";

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
	
	

}
