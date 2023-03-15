package com.natixis.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.natixis.crud.model.Employee;
import com.natixis.crud.service.EmployeeService;


@RestController
public class EmpController {
	
	
	@Autowired
	private EmployeeService empService;
	
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		
	
		
		return empService.getAllEmployees();
		
	}
	@PostMapping("/addEmp")
	public String addNewEmp(@RequestBody Employee emp) {
		
		empService.addNewEmp(emp);
		
		return "Successfully Added new Emp Rec..."+emp.getName();
		
	
	}
	
	@DeleteMapping("/deleteEmp")
	public String deleteEmployee(@RequestParam int id) {
		
		empService.deleteEmp(id);
		
		return "Successfully removed emp Rec..."+id;
	}
	
}
