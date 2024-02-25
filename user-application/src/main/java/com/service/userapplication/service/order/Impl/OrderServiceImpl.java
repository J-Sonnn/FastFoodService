package com.service.userapplication.service.order.Impl;

import com.service.userapplication.model.Order;
import com.service.userapplication.repository.order.OrderRepository;
import com.service.userapplication.service.order.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for handling order-related operations.
 */
@Service
@AllArgsConstructor
@Primary
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    /**
     * Save an order.
     *
     * @param order The Order object to be saved.
     */
    @Override
    public void saveOrder(Order order) {
        repository.save(order);
    }

    /**
     * Retrieve a list of all orders for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Order objects for the specified consumer.
     */
    @Override
    public List<Order> findAllByConsumerId(Long consumerId) {
        return repository.findAllByConsumerId(consumerId);
    }
}