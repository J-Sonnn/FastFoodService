package com.service.userapplication.service.order;

import com.service.userapplication.model.Order;

import java.util.List;

/**
 * Service interface for handling order-related operations.
 */
public interface OrderService {

    /**
     * Save an order.
     *
     * @param order The Order object to be saved.
     */
    void saveOrder(Order order);

    /**
     * Retrieve a list of all orders for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Order objects for the specified consumer.
     */
    List<Order> findAllByConsumerId(Long consumerId);
}