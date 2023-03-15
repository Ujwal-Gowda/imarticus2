package com.natixis.crud.repo;
	
	import java.util.ArrayList;
	import java.util.List;
	import org.springframework.stereotype.Service;

import com.natixis.crud.model.Student;

	@Service
	public class StudentRepo {
		
		private List <Student> stdList;
		
		private List <Student> s1;
		
		public StudentRepo()
		{
			stdList=new ArrayList<Student>();
			stdList.add(new Student(1, "Ram", 8000, 90));
			stdList.add(new Student(2, "Sumam", 20000, 30));
			stdList.add(new Student(3, "karan", 4500, 45));
			stdList.add(new Student(4, "Aman", 4500, 60));
			stdList.add(new Student(5, "Lucky", 5500, 70));
			stdList.add(new Student(6, "Arjun", 4500, 50));
			stdList.add(new Student(7, "Asif", 4500, 20));
			stdList.add(new Student(8, "Ajay", 4500, 18));
			
		}
		
	
		public List<Student> pass() {
			
			s1=new ArrayList<Student>();
			s1.clear();
			for(Student x : s1)
			{
				if(x.getMarks()>=35)
					s1.add(x);
			}
			
			
			return s1;
		}
        public List<Student> fail() {
			
			s1=new ArrayList<Student>();
			
			for(Student x : s1)
			{
				if(x.getMarks()<35)s1.add(x);
					
			}
			
			
			return s1;
		}
        
      public List<Student> fetch(int i) {
			
			s1=new ArrayList<Student>();
			
			for(Student x : s1)
			{
				if(x.getMarks()>=i)s1.add(x);
					
			}
			
			
			return s1;
		
     }
	}