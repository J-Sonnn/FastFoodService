package com.service.adminapplication.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Entity class representing a menu item in the fast food service.
 */
@Data
@Entity
@Table(name = "menu_items")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "restaurant_id")
    private Long restaurantId;
    private String name;
    private float price;

    @Nullable
    private String image;

    @Nullable
    private String description;
}