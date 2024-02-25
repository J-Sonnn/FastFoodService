package com.service.userapplication.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Data Transfer Object (DTO) representing a personal data update request.
 */
@Data
@AllArgsConstructor
public class PersonalDataRequest {

    private String name;
    private String surname;
    private String email;
}