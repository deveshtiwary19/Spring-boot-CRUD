package com.springboot.first.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.first.app.model.Employee;
import com.springboot.first.app.service.EmployeeService;

@RestController
@RequestMapping("/api/employees") //For creating a base url for employees
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	
	//REst API to create Employee (POST Call example)
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), 
				HttpStatus.CREATED);
	}
	
	//Rest API to get list of all employees (Get call example)
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	

}
