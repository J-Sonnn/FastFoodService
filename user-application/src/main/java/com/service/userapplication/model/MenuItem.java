package com.service.userapplication.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a menu item entity.
 */
@Data
@Entity
@Table(name = "menu_items")
public class MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    private String name;
    private float price;

    @Nullable
    private String image;

    @Nullable
    private String description;
}