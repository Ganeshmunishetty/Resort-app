package com.example.auth.controller;

import com.example.auth.dto.AuthResponseDTO;
import com.example.auth.dto.LoginRequestDTO;
import com.example.auth.dto.RegisterRequestDTO;
import com.example.auth.service.AuthService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final AuthService authService;

	public AuthController(AuthService authService) {
		this.authService = authService;
	}

	// ================= REGISTER =================

	@PostMapping("/register/user")
	public ResponseEntity<String> registerUser(@Valid @RequestBody RegisterRequestDTO request) {
		authService.registerUser(request);
		return ResponseEntity.ok("User registered successfully");
	}

	@PostMapping("/register/owner")
	public ResponseEntity<String> registerOwner(@Valid @RequestBody RegisterRequestDTO request) {
		authService.registerOwner(request);
		return ResponseEntity.ok("Owner registered successfully");
	}

	@PostMapping("/register/admin")
	public ResponseEntity<String> registerAdmin(@Valid @RequestBody RegisterRequestDTO request) {
		authService.registerAdmin(request);
		return ResponseEntity.ok("Admin registered successfully");
	}

	// ================= LOGIN =================

	@PostMapping("/login")
	public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginRequestDTO request) {
		return ResponseEntity.ok(authService.login(request));
	}

	// ================= LOGOUT =================

	@PostMapping("/logout")
	public ResponseEntity<String> logout(@RequestParam String refreshToken) {
		authService.logout(refreshToken);
		return ResponseEntity.ok("Logged out successfully");
	}
}
