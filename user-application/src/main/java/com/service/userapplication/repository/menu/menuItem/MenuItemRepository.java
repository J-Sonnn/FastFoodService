package com.service.userapplication.repository.menu.menuItem;

import com.service.userapplication.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on {@link MenuItem} entities.
 */
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

    /**
     * Retrieve all menu items for a specific category.
     *
     * @param categoryId The ID of the category.
     * @return List of MenuItem objects.
     */
    List<MenuItem> findAllByCategoryId(Long categoryId);

    /**
     * Find the restaurant ID associated with a specific menu item.
     *
     * @param menuItemId The ID of the menu item.
     * @return The restaurant ID.
     */
    @Query("SELECT m.restaurantId FROM MenuItem m WHERE m.id = :menuItemId")
    Long findRestaurantIdById(@Param("menuItemId") Long menuItemId);
}