package com.example.RoleBasedAuthentication.models;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "users")
public class User extends BaseEntity implements UserDetails{

   @Column(name = "username", nullable = false)
    private String displayName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Roles role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {  // This method is used to get the authorities (roles) of the user. It returns a collection of GrantedAuthority objects, which represent the roles assigned to the user. In this implementation, it creates a SimpleGrantedAuthority with the role name prefixed by "ROLE_" and returns it as a singleton list.
      return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + role.name()));
    }

    @Override
    public String getUsername(){ // This method is used to get the username of the user. In this implementation, it returns the email as the username, which is a common practice in many applications where the email serves as the unique identifier for the user.
      return email;
    }
}
