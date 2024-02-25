package com.service.adminapplication.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entity class representing a restaurant in the fast food service.
 */
@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    private String address;
}