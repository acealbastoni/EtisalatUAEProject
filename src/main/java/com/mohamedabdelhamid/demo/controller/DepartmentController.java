package com.mohamedabdelhamid.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedabdelhamid.demo.domains.Department;
import com.mohamedabdelhamid.demo.dto.DepartmentDTO;
import com.mohamedabdelhamid.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department createDepartment(@RequestBody DepartmentDTO department) {
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return departmentService.findById(id);
    }
}
