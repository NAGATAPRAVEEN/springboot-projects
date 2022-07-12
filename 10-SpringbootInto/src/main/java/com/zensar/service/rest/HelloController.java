package com.zensar.service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@GetMapping(value = "/great/{myname}")
	public String hello(@PathVariable(name="myname")String name) {
		return  "Hello" + name + " Welcome to REST Services";
	}

}
