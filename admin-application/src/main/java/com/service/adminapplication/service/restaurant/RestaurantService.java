package com.service.adminapplication.service.restaurant;

import com.service.adminapplication.model.Restaurant;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing restaurants in the fast food service.
 */
public interface RestaurantService {

    /**
     * Retrieves a restaurant by its unique identifier.
     *
     * @param id The unique identifier of the restaurant.
     * @return An {@link Optional} containing the restaurant, or empty if not found.
     */
    Optional<Restaurant> findById(Long id);

    /**
     * Retrieves all restaurants.
     *
     * @return A {@link List} of all restaurants.
     */
    List<Restaurant> findAll();

    /**
     * Saves a new restaurant.
     *
     * @param restaurant The restaurant to be saved.
     */
    void saveRestaurant(Restaurant restaurant);

    /**
     * Deletes a restaurant by its unique identifier.
     *
     * @param id The unique identifier of the restaurant to be deleted.
     */
    void deleteRestaurant(Long id);
}