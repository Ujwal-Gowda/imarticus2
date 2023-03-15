package com.natixis.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.natixis.Student;
	
	
	
	@RestController
	public class Welcome{
		
		@GetMapping("/greeting")
		public String m1(@RequestParam int id) {
			
			return "Getting val from browser...."+id;
		}
		
		@PostMapping("/student")
		public String readStudent(@RequestBody Student stu) {
			
					
			
			System.out.println("reading data from browser...");
			
			System.out.println(stu);
			
			return "Successfully Read student data";
			
		}
	}
