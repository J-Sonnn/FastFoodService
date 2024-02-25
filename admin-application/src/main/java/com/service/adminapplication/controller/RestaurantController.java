package com.service.adminapplication.controller;

import com.service.adminapplication.model.Restaurant;
import com.service.adminapplication.service.category.CategoryService;
import com.service.adminapplication.service.menuItem.MenuItemService;
import com.service.adminapplication.service.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller handling operations related to restaurants.
 */
@RestController
@RequestMapping("/restaurant")
@AllArgsConstructor
public class RestaurantController {

    private final RestaurantService service;
    private final CategoryService categoryService;
    private final MenuItemService menuItemService;

    /**
     * Retrieve a list of all restaurants.
     *
     * @return List of Restaurant objects.
     */
    @GetMapping("/get_all")
    public List<Restaurant> returnAllRestaurants() {
        return service.findAll();
    }

    /**
     * Save a new restaurant.
     *
     * @param restaurant The Restaurant object to be saved.
     */
    @PostMapping("/add")
    public void saveRestaurant(@RequestBody Restaurant restaurant) {
        service.saveRestaurant(restaurant);
    }

    /**
     * Delete a restaurant by its ID, along with associated categories and menu items.
     *
     * @param id The ID of the restaurant to be deleted.
     */
    @GetMapping("/delete/{id}")
    public void deleteRestaurant(@PathVariable Long id){
        service.deleteRestaurant(id);
        categoryService.deleteAllByRestaurantId(id);
        menuItemService.deleteAllByRestaurantId(id);
    }
}