package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(String roleName);
}