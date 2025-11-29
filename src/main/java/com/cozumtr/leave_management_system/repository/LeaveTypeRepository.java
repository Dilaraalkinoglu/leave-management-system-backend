package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Long> {
}
