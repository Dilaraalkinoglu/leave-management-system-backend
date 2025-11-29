package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Long> {

    // Yetki ismiyle arama (Örn: "LEAVE_CREATE")
    Optional<Permission> findByPermissionName(String permissionName);
}