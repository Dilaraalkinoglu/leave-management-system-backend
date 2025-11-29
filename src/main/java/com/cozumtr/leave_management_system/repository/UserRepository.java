package com.cozumtr.leave_management_system.repository;

import com.cozumtr.leave_management_system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmployeeEmail(String email);

}
