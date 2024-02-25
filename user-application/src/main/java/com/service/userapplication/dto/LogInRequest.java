package com.service.userapplication.dto;

import lombok.Data;

/**
 * Data Transfer Object (DTO) representing a login request.
 */
@Data
public class LogInRequest {

    private String email;
    private String password;
}