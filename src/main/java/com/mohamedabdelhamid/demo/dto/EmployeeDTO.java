package com.mohamedabdelhamid.demo.dto;

import lombok.Data;

//@Data
public class EmployeeDTO {

	private Long id;

	private String name;

	private boolean active;
	
	private Long department;

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getDepartment() {
		return department;
	}

	public void setDepartment(Long department) {
		this.department = department;
	}
}
