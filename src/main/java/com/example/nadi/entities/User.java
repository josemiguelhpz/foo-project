package com.example.nadi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class User {
    private String email;
    private String password;
    private String role;
    private Boolean isBlocked = false;
    private List<Publication> publications;

    public User(String email, String password, String role, Boolean isBlocked) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.isBlocked = isBlocked;
    }
}
