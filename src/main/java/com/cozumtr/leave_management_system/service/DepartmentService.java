package com.cozumtr.leave_management_system.service;

import com.cozumtr.leave_management_system.entities.Department;
import com.cozumtr.leave_management_system.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    // İleride ID ile bulma vb. buraya eklenecek
}
