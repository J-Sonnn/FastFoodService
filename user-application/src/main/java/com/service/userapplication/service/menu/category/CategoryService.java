package com.service.userapplication.service.menu.category;

import com.service.userapplication.model.Category;

import java.util.List;

/**
 * Service interface for handling operations related to categories.
 */
public interface CategoryService {

    /**
     * Retrieve all categories for a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return List of Category objects.
     */
    List<Category> findAllByRestaurantId(Long restaurantId);
}