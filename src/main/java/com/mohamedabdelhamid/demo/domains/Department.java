package com.mohamedabdelhamid.demo.domains;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mohamedabdelhamid.demo.dto.DepartmentDTO;

import jakarta.persistence.*;
import lombok.Data;

//@Data
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee> employees;

	public Department() {
	}
	
	public Department(DepartmentDTO departmentDTO) {
		this.id=departmentDTO.getId();
		this.name=departmentDTO.getName();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}