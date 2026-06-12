package com.example.RoleBasedAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RoleBasedAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedAuthenticationApplication.class, args);
	}

}
