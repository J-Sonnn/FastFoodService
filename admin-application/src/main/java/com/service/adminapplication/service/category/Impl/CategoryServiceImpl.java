package com.service.adminapplication.service.category.Impl;

import com.service.adminapplication.model.Category;
import com.service.adminapplication.repository.category.CategoryRepository;
import com.service.adminapplication.service.category.CategoryService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of the {@link CategoryService} interface for managing categories in the fast food service.
 */
@Service
@AllArgsConstructor
@Primary
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    /**
     * Retrieves a category by its unique identifier.
     *
     * @param id The unique identifier of the category.
     * @return An {@link Optional} containing the category, or empty if not found.
     */
    @Override
    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    /**
     * Retrieves all categories associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     * @return A {@link List} of categories associated with the restaurant.
     */
    @Override
    public List<Category> findAllByRestaurantId(Long restaurantId) {
        return repository.findAllByRestaurantId(restaurantId);
    }

    /**
     * Saves a new category.
     *
     * @param category The category to be saved.
     */
    @Override
    public void saveCategory(Category category) {
        repository.save(category);
    }

    /**
     * Deletes a category by its unique identifier.
     *
     * @param id The unique identifier of the category to be deleted.
     */
    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    /**
     * Deletes all categories associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     */
    @Override
    @Transactional
    public void deleteAllByRestaurantId(Long restaurantId) {
        repository.deleteAllByRestaurantId(restaurantId);
    }
}