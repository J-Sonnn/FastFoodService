package com.service.userapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Data Transfer Object (DTO) representing an address request.
 */
@Data
@AllArgsConstructor
public class AddressRequest {

    private String city;
    private String street;
    private String streetNumber;
    private String flatNumber;
}