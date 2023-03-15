package com.natixis.crud.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natixis.crud.model.Employee;
import com.natixis.crud.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired 
	public EmployeeRepo empRepo;
	
	public List<Employee> getAllEmployees(){
		
		return empRepo.fetchAllEmployeeData();
	}

	public void addNewEmp(Employee emp) {
		empRepo.addEmp(emp);
		
		
	}


	public void deleteEmp(int id) {
		empRepo.deleteEmployeeById(id);
		
	}


	}


