package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.PublicHoliday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicHolidayRepository extends JpaRepository<PublicHoliday, Long> {
}
