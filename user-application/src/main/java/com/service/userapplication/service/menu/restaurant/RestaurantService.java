package com.service.userapplication.service.menu.restaurant;

import com.service.userapplication.model.Restaurant;

import java.util.List;

/**
 * Service interface for handling operations related to restaurants.
 */
public interface RestaurantService {

    /**
     * Find a restaurant by its address.
     *
     * @param address The address of the restaurant.
     * @return The Restaurant object corresponding to the given address.
     */
    Restaurant findByAddress(String address);

    /**
     * Retrieve a list of all restaurant addresses.
     *
     * @return List of restaurant addresses.
     */
    List<String> findAllAddresses();
}