package com.carnation.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/msg")
	public String msg() {
		
		return "Hello User";
	}
	@GetMapping("/ms")
	public String msf() {
		
		return "Hello Users";
	}
}
