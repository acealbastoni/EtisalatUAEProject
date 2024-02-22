package com.mohamedabdelhamid.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamedabdelhamid.demo.domains.Employee;
import com.mohamedabdelhamid.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void updateEmployeeStatus(Long id,boolean active) {
		employeeRepository.updateEmployeeStatus(id, active);
	}
}
