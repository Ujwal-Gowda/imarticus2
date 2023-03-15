package com.natixis.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natixis.db.model.Student;
import com.natixis.db.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo stuRepo;
	
	public List<Student> fetchAllStudents(){
		
		return stuRepo.findAll();
	}
	
	public void addNewStudent(Student stu) {
		stuRepo.save(stu);
	}

	public void deleteStudentById(int id) {
	
		stuRepo.deleteById(id);
	}

	public String updateStuRec(Student stu) {
	
		String res = "";
		try {
			Student existsStuRec = stuRepo.findById(stu.getId()).get();
			if(existsStuRec !=null) {
			stuRepo.save(stu);
			return "Successfully updated Student Record";
		    }
		}
		catch(Exception e) {
			
			return "Student record not found...";
		}
		return "Student record not found....";
	}

}


