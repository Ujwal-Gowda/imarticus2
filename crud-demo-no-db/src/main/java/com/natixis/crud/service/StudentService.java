package com.natixis.crud.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.natixis.crud.model.Student;
	import com.natixis.crud.repo.StudentRepo;

	@Service
	public class StudentService {
		
		
		@Autowired 
		public StudentRepo stdRepo;
		
		

		public List<Student> passData() {
			
			return stdRepo.pass();
		}

		public List<Student> failData() {
			
			return stdRepo.fail();
		}

		public List<Student> fetchData(int grade) {
			
			return stdRepo.fetch(grade);
		}

}
		

	



