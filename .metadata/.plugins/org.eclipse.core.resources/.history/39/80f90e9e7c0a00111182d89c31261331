package com.example.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MeController {

    @GetMapping("/me")
    public ResponseEntity<Map<String, Object>> me(Authentication authentication) {

        Map<String, Object> response = new HashMap<>();
        response.put("email", authentication.getName());
        response.put("roles", authentication.getAuthorities());

        return ResponseEntity.ok(response);
    }
}
