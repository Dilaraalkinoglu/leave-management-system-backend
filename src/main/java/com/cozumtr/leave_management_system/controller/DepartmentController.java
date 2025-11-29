package com.cozumtr.leave_management_system.controller;

import com.cozumtr.leave_management_system.entities.Department;
import com.cozumtr.leave_management_system.entities.Employee;
import com.cozumtr.leave_management_system.service.DepartmentService;
import com.cozumtr.leave_management_system.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.findAll();
    }

    @GetMapping("/{id}/employees")
    public List<Employee> getEmployeesOfDepartment(@PathVariable Long id) {
        return employeeService.getEmployeesByDepartment(id);
    }
}
