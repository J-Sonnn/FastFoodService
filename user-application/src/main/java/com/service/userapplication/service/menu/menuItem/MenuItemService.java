package com.service.userapplication.service.menu.menuItem;

import com.service.userapplication.model.MenuItem;

import java.util.List;

/**
 * Service interface for handling operations related to menu items.
 */
public interface MenuItemService {

    /**
     * Retrieve all menu items for a specific category.
     *
     * @param categoryId The ID of the category.
     * @return List of MenuItem objects.
     */
    List<MenuItem> findAllByCategoryId(Long categoryId);

    /**
     * Find the restaurant ID for a given menu item ID.
     *
     * @param id The ID of the menu item.
     * @return The ID of the restaurant to which the menu item belongs.
     */
    Long findRestaurantIdById(Long id);
}