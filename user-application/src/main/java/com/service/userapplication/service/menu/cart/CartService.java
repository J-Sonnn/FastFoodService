package com.service.userapplication.service.menu.cart;

import com.service.userapplication.model.Cart;

import java.util.List;

/**
 * Service interface for performing operations related to the shopping cart.
 */
public interface CartService {

    /**
     * Retrieve all items in the shopping cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Cart objects representing items in the cart.
     */
    List<Cart> findAllByConsumerId(Long consumerId);

    /**
     * Save a cart item to the database.
     *
     * @param cart The Cart object to be saved.
     */
    void saveCart(Cart cart);

    /**
     * Retrieve all menu item IDs in the shopping cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of menu item IDs in the cart.
     */
    List<Long> findAllMenuItemsByConsumerId(Long consumerId);

    /**
     * Delete all items in the shopping cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     */
    void deleteAllByConsumerId(Long consumerId);
}