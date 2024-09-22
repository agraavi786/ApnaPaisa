package com.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userDetails")
public class UserDetails {
	
	
	@GetMapping("/get")
	public String getUserDetails() {
		return "Hi getting user details : : Avaneet is the owener of the project" ;
	}

}
