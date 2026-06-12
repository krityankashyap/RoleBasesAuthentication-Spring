package com.example.RoleBasedAuthentication.DTOs;

import lombok.Data;

@Data
public class UserLogInDto { // DTO for user login request
  
  private String email;

  private String password;
}
