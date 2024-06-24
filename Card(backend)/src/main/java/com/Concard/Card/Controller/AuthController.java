package com.Concard.Card.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Concard.Card.DTO.LoginDTO;
import com.Concard.Card.DTO.RegisterDTO;
import com.Concard.Card.Pojos.Otp;
import com.Concard.Card.Service.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        try {
            authService.login(loginDTO);
            return ResponseEntity.ok("Login successful");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials: " + e.getMessage());
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterDTO registerDTO) {
        try {
            authService.register(registerDTO);
            return ResponseEntity.ok("OTP sent to your email. Please verify to complete registration.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<String> verifyOtp(@RequestBody Otp otpDTO) {
        try {
            authService.verifyOtp(otpDTO);
            return ResponseEntity.ok("OTP verified successfully. Registration complete.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("OTP verification failed: " + e.getMessage());
        }
    }
}
