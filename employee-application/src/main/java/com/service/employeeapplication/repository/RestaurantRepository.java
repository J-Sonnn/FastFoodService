package com.service.employeeapplication.repository;

import com.service.employeeapplication.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for performing CRUD operations on Restaurant entities.
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {}