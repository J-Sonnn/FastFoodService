package com.service.userapplication.controller.security;

import com.service.userapplication.dto.LogInRequest;
import com.service.userapplication.service.security.logIn.LogInService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller handling login-related operations.
 */
@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LogInController {

    private final LogInService service;

    /**
     * Check consumer credentials and log in.
     *
     * @param logInRequest The LogInRequest object containing email and password.
     * @return ResponseEntity with a success message or error message.
     */
    @PostMapping
    public ResponseEntity<String> checkConsumer(@RequestBody LogInRequest logInRequest) {

        if (service.findByEmail(logInRequest.getEmail()) == null) {
            return ResponseEntity.badRequest().body("This email is not registered.");
        }

        if (!service.authenticateUser(logInRequest.getEmail(), logInRequest.getPassword())) {
            return ResponseEntity.badRequest().body("Wrong password.");
        }

        return ResponseEntity.ok("User successfully logged in.");
    }
}