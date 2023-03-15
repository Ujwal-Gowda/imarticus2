package com.natixis.greeting.controller;

	import org.springframework.web.bind.annotation.GetMapping;

	import org.springframework.web.bind.annotation.RestController;


	@RestController

	public class MainController {
		
		
		@GetMapping("/hello")
		public String sayHello() {
			System.out.println("welcome to Rest Api");
			
			return "Welcome to Rest API";
			
		}
		
	}

