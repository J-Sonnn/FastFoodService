package com.service.adminapplication.service.restaurant.Impl;

import com.service.adminapplication.model.Restaurant;
import com.service.adminapplication.repository.restaurant.RestaurantRepository;
import com.service.adminapplication.service.restaurant.RestaurantService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for managing restaurants in the fast food service.
 */
@Service
@AllArgsConstructor
@Primary
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repository;

    /**
     * Retrieves all restaurants.
     *
     * @return A {@link List} of all restaurants.
     */
    @Override
    public List<Restaurant> findAll() {
        return repository.findAll();
    }

    /**
     * Saves a new restaurant.
     *
     * @param restaurant The restaurant to be saved.
     */
    @Override
    public void saveRestaurant(Restaurant restaurant) {
        repository.save(restaurant);
    }

    /**
     * Retrieves a restaurant by its unique identifier.
     *
     * @param id The unique identifier of the restaurant.
     * @return An {@link Optional} containing the restaurant, or empty if not found.
     */
    @Override
    public Optional<Restaurant> findById(Long id) {
        return repository.findById(id);
    }

    /**
     * Deletes a restaurant by its unique identifier.
     *
     * @param id The unique identifier of the restaurant to be deleted.
     */
    @Override
    @Transactional
    public void deleteRestaurant(Long id) {
        repository.deleteById(id);
    }
}