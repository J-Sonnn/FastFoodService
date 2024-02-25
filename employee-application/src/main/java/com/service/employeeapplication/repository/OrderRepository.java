package com.service.employeeapplication.repository;

import com.service.employeeapplication.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on Order entities.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    /**
     * Retrieve all orders for a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return List of orders for the specified restaurant.
     */
    List<Order> findAllByRestaurantId(Long restaurantId);

    /**
     * Update the status of an order by its ID.
     *
     * @param id        The ID of the order.
     * @param newStatus The new status to be set.
     */
    @Modifying
    @Query("UPDATE Order u SET u.status = :newStatus WHERE u.id = :id")
    void updateStatusById(@Param("id") Long id, @Param("newStatus") String newStatus);
}