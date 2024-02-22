package com.mohamedabdelhamid.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedabdelhamid.demo.domains.Department;
import com.mohamedabdelhamid.demo.domains.Employee;
import com.mohamedabdelhamid.demo.dto.EmployeeDTO;
import com.mohamedabdelhamid.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.findById(id);
    }
	@PostMapping
	public Employee createEmployee(@RequestBody EmployeeDTO employee) {
		return employeeService.save(employee);
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody EmployeeDTO employee) {
		return employeeService.update(employee);
	}

	@PutMapping("/status")
	public void updateEmployeeStatus(@RequestParam Long id, @RequestParam boolean active) {
	    employeeService.updateEmployeeStatus(id, active);
	}
}