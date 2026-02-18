package com.example.auth.controller;

import com.example.auth.enums.Status;
import com.example.auth.repository.OwnerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminApprovalController {

    private final OwnerRepository ownerRepository;

    public AdminApprovalController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @PutMapping("/approve-owner/{email}")
    public ResponseEntity<String> approveOwner(@PathVariable String email) {

        var owner = ownerRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Owner not found"));

        owner.setStatus(Status.ACTIVE);
        ownerRepository.save(owner);

        return ResponseEntity.ok("Owner approved successfully");
    }
}
