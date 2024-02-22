package com.mohamedabdelhamid.demo.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamedabdelhamid.demo.domains.Department;
import com.mohamedabdelhamid.demo.dto.DepartmentDTO;
import com.mohamedabdelhamid.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	 @Autowired
	 private DepartmentRepository departmentRepository;
	 
	public Department save(DepartmentDTO departmentDTO) {
		Department department =new Department(departmentDTO);
		return departmentRepository.save(department);
	}

	public Department findById(Long id) {
		return departmentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Department not found with id: " + id));
	}

}
