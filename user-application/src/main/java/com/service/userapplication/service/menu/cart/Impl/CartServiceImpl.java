package com.service.userapplication.service.menu.cart.Impl;

import com.service.userapplication.model.Cart;
import com.service.userapplication.repository.menu.cart.CartRepository;
import com.service.userapplication.service.menu.cart.CartService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for performing operations related to the shopping cart.
 */
@Service
@AllArgsConstructor
@Primary
public class CartServiceImpl implements CartService {

    private final CartRepository repository;

    /**
     * Retrieve all items in the shopping cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Cart objects representing items in the cart.
     */
    @Override
    public List<Cart> findAllByConsumerId(Long consumerId) {
        return repository.findAllByConsumerId(consumerId);
    }

    /**
     * Save a cart item to the database.
     *
     * @param cart The Cart object to be saved.
     */
    @Override
    public void saveCart(Cart cart) {
        repository.save(cart);
    }

    /**
     * Retrieve all menu item IDs in the shopping cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of menu item IDs in the cart.
     */
    @Override
    public List<Long> findAllMenuItemsByConsumerId(Long consumerId) {
        return repository.findAllMenuItemsByConsumerId(consumerId);
    }

    /**
     * Delete all items in the shopping cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     */
    @Override
    @Transactional
    public void deleteAllByConsumerId(Long consumerId) {
        repository.deleteAllByConsumerId(consumerId);
    }
}