package com.cozumtr.leave_management_system.controller;

import com.cozumtr.leave_management_system.entities.Employee;
import com.cozumtr.leave_management_system.repository.EmployeeRepository;
import com.cozumtr.leave_management_system.service.AuthService;
import com.cozumtr.leave_management_system.service.LeaveEntitlementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/**
 * İlk IK/HR yöneticisini oluşturmak için basit seed endpoint'i.
 * Sadece geliştirme/demo ortamında kullanılmalı.
 */
@RestController
@RequestMapping("/api/seed")
@RequiredArgsConstructor
public class SeedController {

    private final LeaveEntitlementService leaveEntitlementService;
    private final EmployeeRepository employeeRepository;

    /**
     * Test için: Belirli bir kullanıcıya izin hakkı oluşturur
     * Kullanım: POST /api/seed/leave-entitlement?employeeId=11&year=2025
     */
    @PostMapping("/leave-entitlement")
    public ResponseEntity<String> createLeaveEntitlement(
            @RequestParam Long employeeId,
            @RequestParam(required = false) Integer year
    ) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Çalışan bulunamadı: " + employeeId));

        int targetYear = year != null ? year : LocalDate.now().getYear();

        leaveEntitlementService.createLeaveEntitlementForYear(employee, targetYear);

        return ResponseEntity.ok(String.format(
                "✅ %s %s için %d yılı izin hakkı oluşturuldu (ID: %d)",
                employee.getFirstName(),
                employee.getLastName(),
                targetYear,
                employeeId
        ));
    }
}


