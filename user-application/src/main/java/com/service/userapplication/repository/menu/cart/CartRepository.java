package com.service.userapplication.repository.menu.cart;

import com.service.userapplication.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on {@link Cart} entities.
 */
public interface CartRepository extends JpaRepository<Cart, Long> {

    /**
     * Retrieve all carts for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Cart objects.
     */
    List<Cart> findAllByConsumerId(Long consumerId);

    /**
     * Retrieve all menu item IDs in the cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of menu item IDs.
     */
    @Query("SELECT c.menuItemId FROM Cart c WHERE c.consumerId = :consumerId")
    List<Long> findAllMenuItemsByConsumerId(@Param("consumerId") Long consumerId);

    /**
     * Delete all carts for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     */
    void deleteAllByConsumerId(Long consumerId);
}