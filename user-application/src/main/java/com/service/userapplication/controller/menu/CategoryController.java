package com.service.userapplication.controller.menu;

import com.service.userapplication.model.Category;
import com.service.userapplication.model.Consumer;
import com.service.userapplication.service.LocationService;
import com.service.userapplication.service.menu.category.CategoryService;
import com.service.userapplication.service.consumer.ConsumerService;
import com.service.userapplication.service.menu.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * Controller handling operations related to menu categories and finding the nearest restaurant for a consumer.
 */
@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {

    private final ConsumerService consumerService;
    private final LocationService locationService;
    private final RestaurantService restaurantService;
    private final CategoryService categoryService;

    /**
     * Get all categories for the nearest restaurant based on the consumer's location.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Category objects.
     */
    @GetMapping("/get_all/{consumerId}")
    public List<Category> returnAllCategories(@PathVariable Long consumerId) {
        Consumer consumer = consumerService.findById(consumerId);

        String userAddress = buildUserAddress(consumer);
        String nearestRestaurantAddress = findNearestRestaurant(consumer.getCity() + " " + userAddress);

        if (nearestRestaurantAddress == null) {
            return Collections.emptyList();
        }

        Long nearestRestaurantId = restaurantService.findByAddress(nearestRestaurantAddress).getId();
        return categoryService.findAllByRestaurantId(nearestRestaurantId);
    }

    /**
     * Build the user's address using street and street number.
     *
     * @param consumer The Consumer object.
     * @return User's address as a formatted string.
     */
    private String buildUserAddress(Consumer consumer) {
        return String.format("%s %s", consumer.getStreet(), consumer.getStreetNumber());
    }

    /**
     * Find the nearest restaurant based on the user's location.
     *
     * @param userLocation The user's location.
     * @return Address of the nearest restaurant.
     */
    private String findNearestRestaurant(String userLocation) {
        return locationService.findNearestRestaurant(userLocation, restaurantService.findAllAddresses());
    }
}