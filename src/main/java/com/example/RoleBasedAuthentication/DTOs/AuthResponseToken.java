package com.example.RoleBasedAuthentication.DTOs;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponseToken {  // DTO for sending the token back to the client after successful authentication
    private String token;
    private String name;
    private String email;
    private String role;
  
}
