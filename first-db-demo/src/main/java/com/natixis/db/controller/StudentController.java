package com.natixis.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.natixis.db.model.Student;
import com.natixis.db.service.StudentService;

@RestController
public class StudentController{
	
	
	@Autowired
	private StudentService stuService;
	
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		
		return stuService.fetchAllStudents(); 
	}
	
	
	@PostMapping("/add")
	public String addNewStudentRec(@RequestBody Student stu) {
		
	stuService.addNewStudent(stu);
		
		return "Successfully added new Student Rec..."+stu.getId()+"-" + stu.getName();
	}
	
	@DeleteMapping("/delete")
	public String deleteStudentRec(@RequestParam int id) {
		
		stuService.deleteStudentById(id);
		
		return "Successfully deleted student rec..." +id;
	}
	
	@PutMapping("/updatestudent")
	public String updateStudentRec(@RequestBody Student stu) {
		
	
		
		return 	stuService.updateStuRec(stu);
	}

}
