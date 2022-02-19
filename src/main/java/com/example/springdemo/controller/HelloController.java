package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
     @GetMapping("/hello")
	 public String sayHello() {
		 
		 return "Hello Spring I am Harsha.";
		 
	 }
}
