package com.cozumtr.leave_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class LeaveManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementSystemApplication.class, args);
	}

}
