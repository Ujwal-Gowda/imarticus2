package com.natixis.crud.repo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.natixis.crud.model.Employee;

@Service
public class EmployeeRepo {
	
	private List <Employee> empList;
	
	public EmployeeRepo()
	{
		empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Ram", 8000));
		empList.add(new Employee(2, "Sumam", 20000));
		empList.add(new Employee(3, "karan", 45000));
		empList.add(new Employee(4, "Aman", 45000));
		
	}
	
	public List<Employee> fetchAllEmployeeData()
	{
		return empList;
	}
	
	
	
	public void addEmp(Employee emp) {
		empList.add(emp);
	}
	
	public void deleteEmployeeById(int id) {
	
		for(Employee emp:empList) {
			
			if(emp.getId()== id) { 
				empList.remove(emp);
			}
		
		}
		
	}
}
		
	