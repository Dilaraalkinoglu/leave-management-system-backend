package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Long> {
    // Sadece standart CRUD metotları şimdilik yeterlidir.
    // Özel sorgular Service katmanında yazılabilir.
}