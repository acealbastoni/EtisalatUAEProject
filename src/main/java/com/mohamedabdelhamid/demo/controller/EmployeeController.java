package com.mohamedabdelhamid.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedabdelhamid.demo.domains.Employee;
import com.mohamedabdelhamid.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@PutMapping("/{id}/status")
	public void updateEmployeeStatus(@PathVariable Long id, @RequestParam boolean active) {
		employeeService.updateEmployeeStatus(id, active);
	}
}