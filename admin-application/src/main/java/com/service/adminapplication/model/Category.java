package com.service.adminapplication.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entity class representing a category in the fast food service.
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