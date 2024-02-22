package com.mohamedabdelhamid.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mohamedabdelhamid.demo.domains.Department;
import com.mohamedabdelhamid.demo.domains.Employee;
import com.mohamedabdelhamid.demo.dto.EmployeeDTO;
import com.mohamedabdelhamid.demo.repository.DepartmentRepository;
import com.mohamedabdelhamid.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Transactional
	public Employee save(EmployeeDTO employeeDTO) {
		Employee employee=new Employee();
		employee.setName(employeeDTO.getName());
		employee.setActive(employeeDTO.isActive());
		Department department=departmentRepository.findById(employeeDTO.getDepartment()).orElse(null);
		employee.setDepartment(department);
		return employeeRepository.save(employee);
	}
	@Transactional
	public Employee update(EmployeeDTO employeeDTO) {
		Employee employee=employeeRepository.findById(employeeDTO.getId()).orElse(null);
		if(employee!=null) {
			employee.setName(employeeDTO.getName());
			employee.setActive(employeeDTO.isActive());
			Department department=departmentRepository.findById(employeeDTO.getDepartment()).orElse(null);
			employee.setDepartment(department);
			return employeeRepository.save(employee);
		}else {
			return null;
		}
	}
	
	public void updateEmployeeStatus(Long id,boolean active) {
		employeeRepository.updateEmployeeStatus(id, active);
	}
	public Employee findById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}
}
