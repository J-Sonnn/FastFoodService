package com.service.userapplication.dto;

import lombok.Data;

/**
 * Data Transfer Object (DTO) representing a password change request.
 */
@Data
public class PasswordRequest {

    private String newPassword;
    private String newPasswordConfirm;
}