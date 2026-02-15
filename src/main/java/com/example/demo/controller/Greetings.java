package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

	@GetMapping("/")
	public String getGreetings() {
		return "Hello world";
	}
	
	public String sonarTest() {
		String name=null;
		return name.toString();
	}
}
