package com.service.userapplication.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a cart entity.
 */
@Data
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "consumer_id")
    private Long consumerId;

    @Column(name = "menu_item_id")
    private Integer menuItemId;
}