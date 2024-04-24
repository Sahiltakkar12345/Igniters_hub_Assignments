package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Hello you are in getMessage Method";
	}

	@GetMapping("/students")
	public String getstudent()
	{
		return "Hello you are in getstudent Method";
	}
}
