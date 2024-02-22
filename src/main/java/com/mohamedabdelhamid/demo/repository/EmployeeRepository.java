package com.mohamedabdelhamid.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mohamedabdelhamid.demo.domains.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("UPDATE Employee e SET e.active = :active WHERE e.id = :id")
	void updateEmployeeStatus(@Param("id") Long id, @Param("active") boolean active);
}
