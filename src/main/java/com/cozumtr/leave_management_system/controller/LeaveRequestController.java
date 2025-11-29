package com.cozumtr.leave_management_system.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leaves")
public class LeaveRequestController {
    @PostMapping
    public String createLeave() {
        return "İzin talep etme ucu...";
    }

    @GetMapping("/my-leaves")
    public String getMyLeaves() {
        return "Geçmiş izinlerim listesi...";
    }
}
