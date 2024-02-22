package com.mohamedabdelhamid.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mohamedabdelhamid.demo.domains.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Transactional
	@Modifying
	@Query("UPDATE Employee set active = :active WHERE id = :id ")
	void updateEmployeeStatus(@Param("id") Long id, @Param("active") boolean active);
}
