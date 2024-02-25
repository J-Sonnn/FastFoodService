package com.service.userapplication.repository.menu.category;

import com.service.userapplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on {@link Category} entities.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    /**
     * Retrieve all categories for a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return List of Category objects.
     */
    List<Category> findAllByRestaurantId(Long restaurantId);
}