package com.service.adminapplication.service.menuItem.Impl;

import com.service.adminapplication.model.MenuItem;
import com.service.adminapplication.repository.menuItem.MenuItemRepository;
import com.service.adminapplication.service.menuItem.MenuItemService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing menu items in the fast food service.
 */
@Service
@AllArgsConstructor
@Primary
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository repository;

    /**
     * Retrieves a menu item by its unique identifier.
     *
     * @param id The unique identifier of the menu item.
     * @return An {@link Optional} containing the menu item, or empty if not found.
     */
    @Override
    public Optional<MenuItem> findById(Long id) {
        return repository.findById(id);
    }

    /**
     * Retrieves all menu items associated with a specific category.
     *
     * @param categoryId The unique identifier of the category.
     * @return A {@link List} of menu items associated with the category.
     */
    @Override
    public List<MenuItem> findAllByCategoryId(Long categoryId) {
        return repository.findAllByCategoryId(categoryId);
    }

    /**
     * Saves a new menu item.
     *
     * @param menuItem The menu item to be saved.
     */
    @Override
    public void saveMenuItem(MenuItem menuItem) {
        repository.save(menuItem);
    }

    /**
     * Updates the details of a menu item by its unique identifier.
     *
     * @param id          The unique identifier of the menu item to be updated.
     * @param name        The new name of the menu item.
     * @param price       The new price of the menu item.
     * @param image       The new image URL of the menu item.
     * @param description The new description of the menu item.
     */
    @Override
    @Transactional
    public void updateMenuItemById(Long id, String name, float price, String image, String description) {
        repository.updateMenuItemById(id, name, price, image, description);
    }

    /**
     * Deletes a menu item by its unique identifier.
     *
     * @param id The unique identifier of the menu item to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    /**
     * Deletes all menu items associated with a specific category.
     *
     * @param categoryId The unique identifier of the category.
     */
    @Override
    @Transactional
    public void deleteAllByCategoryId(Long categoryId) {
        repository.deleteAllByCategoryId(categoryId);
    }

    /**
     * Deletes all menu items associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     */
    @Override
    @Transactional
    public void deleteAllByRestaurantId(Long restaurantId) {
        repository.deleteAllByRestaurantId(restaurantId);
    }
}