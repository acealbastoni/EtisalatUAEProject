package com.mohamedabdelhamid.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohamedabdelhamid.demo.domains.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
