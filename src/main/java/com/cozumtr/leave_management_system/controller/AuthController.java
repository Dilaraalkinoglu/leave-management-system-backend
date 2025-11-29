package com.cozumtr.leave_management_system.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    // Frontendci bilsin diye yazıyoruz, içi boş.
    @PostMapping("/login")
    public String login() {
        return "Buraya giriş yapılacak - Backend hazırlanıyor...";
    }

    @PostMapping("/register")
    public String register() {
        return "Buraya kayıt olunacak...";
    }
}
