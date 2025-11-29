package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.LeaveAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveAttachmentRepository extends JpaRepository<LeaveAttachment, Long> {
}
