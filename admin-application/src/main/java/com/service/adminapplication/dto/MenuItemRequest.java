package com.service.adminapplication.dto;

import lombok.Data;

/**
 * Data Transfer Object (DTO) representing the request for creating or updating a menu item.
 */
@Data
public class MenuItemRequest {

    private String name;
    private float price;
    private String image;
    private String description;
}