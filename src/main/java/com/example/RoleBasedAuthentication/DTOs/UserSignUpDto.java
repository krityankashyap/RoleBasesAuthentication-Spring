package com.example.RoleBasedAuthentication.DTOs;

import com.example.RoleBasedAuthentication.models.Roles;

import lombok.Data;

@Data
public class UserSignUpDto { // DTO for user signup request
  
  private String name;

  private String email;

  private String password;

  private Roles role;
}
