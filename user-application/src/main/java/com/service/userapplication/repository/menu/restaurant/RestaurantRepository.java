package com.service.userapplication.repository.menu.restaurant;

import com.service.userapplication.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on {@link Restaurant} entities.
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    /**
     * Find a restaurant by its address.
     *
     * @param address The address of the restaurant.
     * @return The Restaurant object.
     */
    Restaurant findByAddress(String address);

    /**
     * Retrieve all addresses of existing restaurants.
     *
     * @return List of restaurant addresses.
     */
    @Query("SELECT r.address FROM Restaurant r")
    List<String> findAllAddresses();
}