package com.service.adminapplication.service.menuItem;

import com.service.adminapplication.model.MenuItem;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing menu items in the fast food service.
 */
public interface MenuItemService {

    /**
     * Retrieves a menu item by its unique identifier.
     *
     * @param id The unique identifier of the menu item.
     * @return An {@link Optional} containing the menu item, or empty if not found.
     */
    Optional<MenuItem> findById(Long id);

    /**
     * Retrieves all menu items associated with a specific category.
     *
     * @param categoryId The unique identifier of the category.
     * @return A {@link List} of menu items associated with the category.
     */
    List<MenuItem> findAllByCategoryId(Long categoryId);

    /**
     * Saves a new menu item.
     *
     * @param menuItem The menu item to be saved.
     */
    void saveMenuItem(MenuItem menuItem);

    /**
     * Updates the details of a menu item by its unique identifier.
     *
     * @param id          The unique identifier of the menu item to be updated.
     * @param name        The new name of the menu item.
     * @param price       The new price of the menu item.
     * @param image       The new image URL of the menu item.
     * @param description The new description of the menu item.
     */
    void updateMenuItemById(Long id, String name, float price, String image, String description);

    /**
     * Deletes a menu item by its unique identifier.
     *
     * @param id The unique identifier of the menu item to be deleted.
     */
    void deleteById(Long id);

    /**
     * Deletes all menu items associated with a specific category.
     *
     * @param categoryId The unique identifier of the category.
     */
    void deleteAllByCategoryId(Long categoryId);

    /**
     * Deletes all menu items associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     */
    void deleteAllByRestaurantId(Long restaurantId);
}