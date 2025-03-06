package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoRestController {

	
	@GetMapping("/msg")
	public String showMessage() {
		return "<h1> Welcome to Spring Boot App running on docker container </h1> ";
	}
	
}
