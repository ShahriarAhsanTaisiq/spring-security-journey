package com.learning.spring_security.controller;

import com.learning.spring_security.service.UserAuthServiceImpl;
import com.learning.spring_security.entity.UserAuthEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserAuthController {

    private final UserAuthServiceImpl userAuthService;

    private final PasswordEncoder passwordEncoder;

    public UserAuthController(UserAuthServiceImpl userAuthService, PasswordEncoder passwordEncoder) {
        this.userAuthService = userAuthService;
        this.passwordEncoder = passwordEncoder;
    }


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserAuthEntity userAuthEntity) {
        userAuthEntity.setPassword(passwordEncoder.encode(userAuthEntity.getPassword()));
        userAuthService.save(userAuthEntity);
        return ResponseEntity.ok("User has been registered successfully");
    }
}
