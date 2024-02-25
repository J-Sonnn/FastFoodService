package com.service.userapplication.controller.security;

import com.service.userapplication.model.Consumer;
import com.service.userapplication.service.security.signUp.SignUpService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller handling sign-up related operations.
 */
@RestController
@RequestMapping("/signup")
@AllArgsConstructor
public class SignUpController {

    private final SignUpService service;

    /**
     * Save a new consumer during the sign-up process.
     *
     * @param consumer The Consumer object containing sign-up details.
     * @return ResponseEntity with a success message or error message.
     */
    @PostMapping
    public ResponseEntity<String> saveConsumer(@RequestBody Consumer consumer) {

        if (!consumer.getPassword().equals(consumer.getConfirmPassword())) {
            return ResponseEntity.badRequest().body("Passwords do not match");
        }

        if (service.findByEmail(consumer.getEmail()) != null || service.findByPhoneNumber(consumer.getPhoneNumber()) != null) {
            return ResponseEntity.badRequest().body("This phone number or email is already registered");
        }

        service.saveConsumer(consumer);
        return ResponseEntity.ok("User registered successfully");
    }
}