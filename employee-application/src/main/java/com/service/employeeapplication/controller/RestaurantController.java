package com.service.employeeapplication.controller;

import com.service.employeeapplication.model.Restaurant;
import com.service.employeeapplication.service.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for handling operations related to restaurants.
 */
@RestController
@RequestMapping("/restaurant")
@AllArgsConstructor
public class RestaurantController {

    private final RestaurantService service;

    /**
     * Retrieve all restaurants.
     *
     * @return ResponseEntity with a list of restaurants or no content if there are no restaurants.
     */
    @GetMapping("/get_all")
    public ResponseEntity<List<Restaurant>> returnAllRestaurants() {
        List<Restaurant> restaurants = service.findAll();

        if (restaurants.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(restaurants);
    }
}