package com.service.userapplication.controller.settings;

import com.service.userapplication.dto.PasswordRequest;
import com.service.userapplication.service.settings.password.PasswordService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller handling operations related to consumer passwords.
 */
@RestController
@RequestMapping("/settings")
@AllArgsConstructor
public class PasswordController {

    private final PasswordService passwordService;

    /**
     * Update the password for a consumer.
     *
     * @param consumerId       The ID of the consumer.
     * @param passwordRequest  The request containing new password details.
     * @return ResponseEntity with a success or error message.
     */
    @PostMapping("/password/{consumerId}")
    public ResponseEntity<String> updatePassword(@PathVariable Long consumerId, @RequestBody PasswordRequest passwordRequest) {

        // Check if the new passwords match
        if (!passwordRequest.getNewPassword().equals(passwordRequest.getNewPasswordConfirm())) {
            return ResponseEntity.badRequest().body("Passwords do not match");
        }

        try {
            // Update the password and confirm password
            passwordService.updatePassword(consumerId, passwordRequest.getNewPassword());
            passwordService.updateConfirmPassword(consumerId, passwordRequest.getNewPasswordConfirm());
            return ResponseEntity.ok("Password changed successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to change password");
        }
    }
}