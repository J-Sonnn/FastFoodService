package com.service.userapplication.service.menu.menuItem.Impl;

import com.service.userapplication.model.MenuItem;
import com.service.userapplication.repository.menu.menuItem.MenuItemRepository;
import com.service.userapplication.service.menu.menuItem.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for handling operations related to menu items.
 */
@Service
@AllArgsConstructor
@Primary
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository repository;

    /**
     * Retrieve all menu items for a specific category.
     *
     * @param categoryId The ID of the category.
     * @return List of MenuItem objects.
     */
    @Override
    public List<MenuItem> findAllByCategoryId(Long categoryId) {
        return repository.findAllByCategoryId(categoryId);
    }

    /**
     * Find the restaurant ID for a given menu item ID.
     *
     * @param id The ID of the menu item.
     * @return The ID of the restaurant to which the menu item belongs.
     */
    @Override
    public Long findRestaurantIdById(Long id) {
        return repository.findRestaurantIdById(id);
    }
}