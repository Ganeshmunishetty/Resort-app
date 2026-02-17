package com.example.auth.service;

import com.example.auth.dto.AuthResponseDTO;
import com.example.auth.dto.LoginRequestDTO;
import com.example.auth.dto.RegisterRequestDTO;

public interface AuthService {

    void registerUser(RegisterRequestDTO request);

    void registerOwner(RegisterRequestDTO request);

    void registerAdmin(RegisterRequestDTO request);

    AuthResponseDTO login(LoginRequestDTO request);
}
