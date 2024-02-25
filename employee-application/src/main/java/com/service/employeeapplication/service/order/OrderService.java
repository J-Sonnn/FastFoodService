package com.service.employeeapplication.service.order;

import com.service.employeeapplication.model.Order;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing orders.
 */
public interface OrderService {

    /**
     * Retrieve all orders associated with a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return List of Order entities associated with the specified restaurant.
     */
    List<Order> findAllByRestaurantId(Long restaurantId);

    /**
     * Retrieve an order by its ID.
     *
     * @param id The ID of the order.
     * @return Optional containing the Order entity with the specified ID, or empty if not found.
     */
    Optional<Order> findById(Long id);

    /**
     * Update the status of an order by its ID.
     *
     * @param id          The ID of the order.
     * @param newStatus   The new status for the order.
     */
    void updateStatusById(Long id, String newStatus);

    /**
     * Delete an order by its ID.
     *
     * @param id The ID of the order to be deleted.
     */
    void deleteById(Long id);
}