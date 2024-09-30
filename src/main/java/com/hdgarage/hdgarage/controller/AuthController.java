package com.hdgarage.hdgarage.controller;


import com.hdgarage.hdgarage.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class AuthController {



    @Autowired
    private UserService userService;



}
