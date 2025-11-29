package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.LeaveEntitlement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LeaveEntitlementRepository extends JpaRepository<LeaveEntitlement, Long> {
    Optional<LeaveEntitlement> findByEmployeeIdAndYear(Long employeeId, int year);
}
