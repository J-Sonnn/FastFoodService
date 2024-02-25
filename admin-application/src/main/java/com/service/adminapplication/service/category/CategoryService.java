package com.service.adminapplication.service.category;

import com.service.adminapplication.model.Category;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing categories in the fast food service.
 */
public interface CategoryService {

    /**
     * Retrieves a category by its unique identifier.
     *
     * @param id The unique identifier of the category.
     * @return An {@link Optional} containing the category, or empty if not found.
     */
    Optional<Category> findById(Long id);

    /**
     * Retrieves all categories associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     * @return A {@link List} of categories associated with the restaurant.
     */
    List<Category> findAllByRestaurantId(Long restaurantId);

    /**
     * Saves a new category.
     *
     * @param category The category to be saved.
     */
    void saveCategory(Category category);

    /**
     * Deletes a category by its unique identifier.
     *
     * @param id The unique identifier of the category to be deleted.
     */
    void deleteById(Long id);

    /**
     * Deletes all categories associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     */
    void deleteAllByRestaurantId(Long restaurantId);
}