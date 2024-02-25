package com.service.userapplication.service.menu.category.Impl;

import com.service.userapplication.model.Category;
import com.service.userapplication.repository.menu.category.CategoryRepository;
import com.service.userapplication.service.menu.category.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for handling operations related to categories.
 */
@Service
@AllArgsConstructor
@Primary
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    /**
     * Retrieve all categories for a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return List of Category objects.
     */
    @Override
    public List<Category> findAllByRestaurantId(Long restaurantId) {
        return repository.findAllByRestaurantId(restaurantId);
    }
}