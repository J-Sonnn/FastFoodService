package com.service.employeeapplication.service.order.Impl;

import com.service.employeeapplication.model.Order;
import com.service.employeeapplication.repository.OrderRepository;
import com.service.employeeapplication.service.order.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of the OrderService interface that provides service methods related to Order entities.
 */
@Service
@AllArgsConstructor
@Primary
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    /**
     * Retrieve all orders associated with a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return List of Order entities associated with the specified restaurant.
     */
    @Override
    public List<Order> findAllByRestaurantId(Long restaurantId) {
        return repository.findAllByRestaurantId(restaurantId);
    }

    /**
     * Retrieve an order by its ID.
     *
     * @param id The ID of the order.
     * @return Optional containing the Order entity with the specified ID, or empty if not found.
     */
    @Override
    public Optional<Order> findById(Long id) {
        return repository.findById(id);
    }

    /**
     * Update the status of an order by its ID.
     *
     * @param id        The ID of the order.
     * @param newStatus The new status to set for the order.
     */
    @Override
    public void updateStatusById(Long id, String newStatus) {
        repository.updateStatusById(id, newStatus);
    }

    /**
     * Delete an order by its ID.
     *
     * @param id The ID of the order to be deleted.
     */
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}