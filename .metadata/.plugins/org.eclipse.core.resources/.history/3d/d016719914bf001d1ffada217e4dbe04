package com.pipe.demo.controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pipe.demo.model.Employee;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		List<Employee> empList = Arrays.asList(
				new Employee("ujwal", "2345"));
		
		return empList;
			
	
	}
}
