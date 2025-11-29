package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
