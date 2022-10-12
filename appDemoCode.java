package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appDemoCode {
	
	@GetMapping("")
	public String sayHello() {
		return "Hi i'm from say Hello";
	}
	@GetMapping("/name")
	public String add() {
		return "My name is appDemo for final case stusy";
	}

}