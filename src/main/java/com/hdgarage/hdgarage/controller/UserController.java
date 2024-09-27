package com.hdgarage.hdgarage.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @GetMapping("/users")
    public String users(Model model) {
        return "users";
    }
}
