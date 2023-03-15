package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	

@GetMapping("all")
@CrossOrigin("http://localhost:4200")
public List<Student> getAllStudents(){
	
	return stuService.getAllStudents();
}

@GetMapping("stdfee")
@CrossOrigin("http://localhost:4200")
public List<Student> getFees(int fees){
	
	return stuService.getFees(fees);
}

@GetMapping("search")
@CrossOrigin("http://localhost:4200")
public List<Student> getSpecifiedStudent(int marks){
	
	return stuService.getStudentByMarks(marks);
	
}

@GetMapping("searchFee")
@CrossOrigin("http://localhost:4200")
public List<Student> getSpecifiedStudentFee(int fees){
	
	return stuService.getStudentByFee(fees);
}
}