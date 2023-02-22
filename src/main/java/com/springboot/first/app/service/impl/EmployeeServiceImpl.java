package com.springboot.first.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.first.app.model.Employee;
import com.springboot.first.app.repository.EmployeeRepository;
import com.springboot.first.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	
	

}
