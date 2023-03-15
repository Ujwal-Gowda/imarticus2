package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;

	public List<Student> getAllStudents() {
		
		return stuRepo.getAllStudents();
	}

	public List<Student> getFees(int fees) {
		
		return stuRepo.getFees(fees);
	}

	public List<Student> getStudentByMarks(int marks) {
		
			
			return stuRepo.getAllStudents().stream().filter((stu)->stu.getMarks() >marks).collect(Collectors.toList());
	}

	public List<Student> getStudentByFee(int fees) {
		
		return stuRepo.getAllStudents().stream().filter((stu)->stu.getFees() >fees).collect(Collectors.toList());
	}
	
	
	}



