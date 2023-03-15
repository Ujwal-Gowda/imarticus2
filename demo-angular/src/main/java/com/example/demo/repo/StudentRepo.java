package com.example.demo.repo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.model.Student;

@Component
public class StudentRepo {
	
	List<Student> stuList = Arrays.asList(
			new Student(1, "Tilak", 85, 58000),
			new Student(2, "Udhav", 80, 52000),
			new Student(3, "Asif", 75, 48000),
			new Student(4, "Raj", 86, 59000),
			new Student(5, "Abhi", 59, 42000),
			new Student(6, "Ashok", 77, 55000));
		
	public List<Student> getAllStudents(){
		return stuList;
	}

	public List<Student> getFees(int fees) {
		
		return stuList.stream().filter(x->x.getFees()>fees).collect(Collectors.toList());
	}

}
