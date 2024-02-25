package com.service.userapplication.service.menu.restaurant.Impl;

import com.service.userapplication.model.Restaurant;
import com.service.userapplication.repository.menu.restaurant.RestaurantRepository;
import com.service.userapplication.service.menu.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for handling operations related to restaurants.
 */
@Service
@AllArgsConstructor
@Primary
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repository;

    /**
     * Find a restaurant by its address.
     *
     * @param address The address of the restaurant.
     * @return The Restaurant object corresponding to the given address.
     */
    @Override
    public Restaurant findByAddress(String address) {
        return repository.findByAddress(address);
    }

    /**
     * Retrieve a list of all restaurant addresses.
     *
     * @return List of restaurant addresses.
     */
    @Override
    public List<String> findAllAddresses() {
        return repository.findAllAddresses();
    }
}