package com.service.userapplication.repository.order;

import com.service.userapplication.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on {@link Order} entities.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    /**
     * Retrieve all orders associated with a specific consumer ID.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Order objects.
     */
    List<Order> findAllByConsumerId(Long consumerId);
}