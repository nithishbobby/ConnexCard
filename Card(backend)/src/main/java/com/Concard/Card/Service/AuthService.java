package com.Concard.Card.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.Concard.Card.DTO.LoginDTO;
import com.Concard.Card.DTO.RegisterDTO;
import com.Concard.Card.Pojos.Otp;
import com.Concard.Card.Pojos.User;
import com.Concard.Card.Repo.OtpRepository;
import com.Concard.Card.Repo.UserRepository;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OtpRepository otpRepository;

    @Autowired
    private EmailService emailService;

    private Map<String, RegisterDTO> temporaryUserStorage = new HashMap<>();

    public User login(LoginDTO loginDTO) {
        User user = null;
        if (loginDTO.getEmail() != null) {
            user = userRepository.findByEmail(loginDTO.getEmail());
        } else if (loginDTO.getPhoneNumber() != null) {
            user = userRepository.findByPhoneNumber(loginDTO.getPhoneNumber());
        }

        if (user != null && user.getPassword().equals(loginDTO.getPassword())) {
            return user;
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    public void register(RegisterDTO registerDTO) {
        if (userRepository.findByEmail(registerDTO.getEmail()) != null) {
            throw new RuntimeException("User already exists with this email");
        }

        String otp = generateOtp();
        sendOtpEmail(registerDTO.getEmail(), otp);

        otpRepository.save(new Otp(registerDTO.getEmail(), otp));
        temporaryUserStorage.put(registerDTO.getEmail(), registerDTO);
    }

    public void verifyOtp(Otp otpDTO) {
        Otp otpEntity = otpRepository.findByEmail(otpDTO.getEmail());
        if (otpEntity == null || !otpEntity.getOtp().equals(otpDTO.getOtp())) {
            throw new RuntimeException("Invalid OTP");
        }

        RegisterDTO registerDTO = temporaryUserStorage.get(otpDTO.getEmail());
        if (registerDTO == null) {
            throw new RuntimeException("No user registration data found");
        }

        User user = new User();
        user.setFirstName(registerDTO.getFirstName());
        user.setLastName(registerDTO.getLastName());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword()); // Hash the password in a real application
        user.setPhoneNumber(registerDTO.getPhoneNumber());
        user.setVerified(true);

        userRepository.save(user);

        temporaryUserStorage.remove(otpDTO.getEmail());
        otpRepository.delete(otpEntity);
    }

    private String generateOtp() {
        return String.valueOf((int) (Math.random() * 9000) + 1000);
    }

    @Async
    public void sendOtpEmail(String email, String otp) {
        emailService.sendOtp(email, otp);
    }
}
