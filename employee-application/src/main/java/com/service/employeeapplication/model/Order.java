package com.service.employeeapplication.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/**
 * Represents an order entity.
 */
@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "consumer_id")
    private Long consumerId;

    private String status = "confirmation";

    @Nullable
    private String description;

    /**
     * Represents a collection of menu item IDs associated with an order.
     * Each element in the collection corresponds to a menu item included in the order.
     * The collection is mapped to a separate table named "order_menu_items" with a foreign key referencing the order ID.
     */
    @ElementCollection
    @CollectionTable(name = "order_menu_items", joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "menu_item_id")
    private List<Long> menuItemId;
}