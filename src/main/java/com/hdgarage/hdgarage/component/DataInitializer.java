package com.hdgarage.hdgarage.component;

import com.hdgarage.hdgarage.model.User;
import com.hdgarage.hdgarage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public CommandLineRunner init() {
        return args -> {
            User adminUser = new User();
            adminUser.setUsername("admin");
            adminUser.setPassword(passwordEncoder.encode("admin"));
            adminUser.setEmail("admin@admin.com");
            adminUser.setPhone("+36302699436");
            adminUser.setBirthday("1994-10-14");
            adminUser.setEnabled(true);
            adminUser.setRole("ADMIN");


            userService.saveUser(adminUser);

        };
    }
}
