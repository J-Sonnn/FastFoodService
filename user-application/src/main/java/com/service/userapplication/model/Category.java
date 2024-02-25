package com.service.userapplication.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a category entity.
 */
@Data
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    private String name;
}