package com.service.adminapplication.repository.restaurant;

import com.service.adminapplication.model.Restaurant;
import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing restaurants in the fast food service.
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    /**
     * Retrieves all restaurants.
     *
     * @return A {@link List} of all restaurants.
     */
    List<Restaurant> findAll();

    /**
     * Retrieves a restaurant by its unique identifier.
     *
     * @param id The unique identifier of the restaurant.
     * @return An {@link Optional} containing the restaurant, or empty if not found.
     */
    Optional<Restaurant> findById(@Nullable Long id);

    /**
     * Deletes a restaurant by its unique identifier.
     *
     * @param id The unique identifier of the restaurant to be deleted.
     */
    void deleteById(@Nullable Long id);
}