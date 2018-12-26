package com.utn.jfm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/helloWorld")
	public String helloSpring () {
		return "hello world from Spring Boot";
	}
	
	
	
}
