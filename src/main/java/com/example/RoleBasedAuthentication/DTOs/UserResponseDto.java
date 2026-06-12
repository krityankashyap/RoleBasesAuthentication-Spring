package com.example.RoleBasedAuthentication.DTOs;

import com.example.RoleBasedAuthentication.models.Roles;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UserResponseDto { // DTO for user response (after login or signup)

  private String name;

  private String email;

  private Roles role;
}
