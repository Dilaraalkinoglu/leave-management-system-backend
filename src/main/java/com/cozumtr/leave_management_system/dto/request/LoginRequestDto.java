package com.cozumtr.leave_management_system.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDto {

    @Email(message = "Geçerli bir e-posta adresi giriniz")
    @NotBlank(message = "E-posta alanı boş bırakılamaz")
    private String email;

    @NotBlank(message = "Şifre alanı boş bırakılamaz")
    private String password;
}