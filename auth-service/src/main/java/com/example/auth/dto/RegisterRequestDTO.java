package com.example.auth.dto;

import java.time.LocalDate;

import com.example.auth.enums.Gender;

public class RegisterRequestDTO {

    private String email;
    private String password;
    private String name;
    private Gender gender;      // NEW: "MALE" or "FEMALE"
    private LocalDate dateOfBirth;  // NEW: Replaces Integer age
    private String phone;

    // ========== GETTERS & SETTERS ==========
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
