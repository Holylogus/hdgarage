package com.hdgarage.hdgarage.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @NotEmpty(message = "Username cannot be empty")
    @Getter @Setter
    private String username;

    @NotEmpty(message = "Password cannot be empty")
    @Getter @Setter
    private String password;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email cannot be empty")
    @Getter @Setter
    private String email;

    @Getter @Setter
    private String phone;
    @Getter @Setter
    private String birthday;

    @Getter @Setter
    private boolean enabled; //Titkosításhoz

    @Getter @Setter
    private String role;




    public User() {
        super();
    }

    public User(String username, String password, String email, String phone, String birthday) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.role = "USER";
    }


}
