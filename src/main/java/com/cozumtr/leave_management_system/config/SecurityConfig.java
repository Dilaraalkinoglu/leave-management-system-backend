package com.cozumtr.leave_management_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Postman ile veri yollarken hata almamak için kapattık
                .authorizeHttpRequests(auth -> auth
                        // 1. Swagger ve API dökümanlarına HERKES girebilsin (Şifre sorma)
                        .requestMatchers(
                                "/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/swagger-ui.html",
                                "/api/**"
                        ).permitAll()

                        // 2. Geri kalan TÜM sayfalar için şifre sor
                        .anyRequest().authenticated()
                )
                // Varsayılan giriş formunu kullan (Login ekranı gelsin)
                .formLogin(Customizer.withDefaults())
                // Postman'den deneme yapmak için Basic Auth desteğini aç
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    // Şifreleme makinesi (Veritabanına personel kaydederken lazım olacak)
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}