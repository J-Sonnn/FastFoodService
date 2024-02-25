package com.service.employeeapplication.service.restaurant.Impl;

import com.service.employeeapplication.model.Restaurant;
import com.service.employeeapplication.repository.RestaurantRepository;
import com.service.employeeapplication.service.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation for managing restaurants.
 */
@Service
@AllArgsConstructor
@Primary
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repository;

    /**
     * Retrieve all restaurants.
     *
     * @return List of all Restaurant entities.
     */
    @Override
    public List<Restaurant> findAll() {
        return repository.findAll();
    }
}