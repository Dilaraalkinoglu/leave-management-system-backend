package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // E-postaya göre personel bul (Tek bir sonuç bekleriz)
    Optional<Employee> findByEmail(String email);

    // Bir departmandaki herkesi getir
    List<Employee> findByDepartmentId(Long departmentId);
}
