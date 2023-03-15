package com.natixis.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.natixis.crud.service.StudentService;
import com.natixis.crud.model.Student;


@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService stdService;
	
	
	@GetMapping("/pass")
	public List< Student> pass(){
		
		return stdService.passData();
		
	}

	@GetMapping("/fail")
	public List< Student> fail(){
		
		return stdService.failData();
	
}

	@GetMapping("/fetch")
	public List< Student> fetch(int grade){
		
		return stdService.fetchData(grade);
		
	}
}
