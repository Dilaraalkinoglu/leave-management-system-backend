package com.cozumtr.leave_management_system.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {
    @GetMapping("/pending-leaves")
    public String getPendingLeaves() {
        return "Onay bekleyen izinler...";
    }

    @PutMapping("/leaves/{id}/approve")
    public String approveLeave(@PathVariable Long id) {
        return id + " nolu izin onaylanacak...";
    }
}
