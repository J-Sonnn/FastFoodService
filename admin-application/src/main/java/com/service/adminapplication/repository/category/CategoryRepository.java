package com.service.adminapplication.repository.category;

import com.service.adminapplication.model.Category;
import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing categories in the fast food service.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    /**
     * Retrieves a category by its unique identifier.
     *
     * @param id The unique identifier of the category.
     * @return An {@link Optional} containing the category, or empty if not found.
     */
    Optional<Category> findById(@Nullable Long id);

    /**
     * Retrieves all categories associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     * @return A {@link List} of categories associated with the specified restaurant.
     */
    List<Category> findAllByRestaurantId(Long restaurantId);

    /**
     * Deletes a category by its unique identifier.
     *
     * @param id The unique identifier of the category to be deleted.
     */
    void deleteById(@Nullable Long id);

    /**
     * Deletes all categories associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     */
    void deleteAllByRestaurantId(Long restaurantId);
}