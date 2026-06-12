package com.example.RoleBasedAuthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RoleBasedAuthentication.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
  
}
