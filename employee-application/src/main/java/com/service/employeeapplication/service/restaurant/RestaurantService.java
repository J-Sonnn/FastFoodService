package com.service.employeeapplication.service.restaurant;

import com.service.employeeapplication.model.Restaurant;

import java.util.List;

/**
 * Service interface for managing restaurants.
 */
public interface RestaurantService {

    /**
     * Retrieve all restaurants.
     *
     * @return List of all Restaurant entities.
     */
    List<Restaurant> findAll();
}