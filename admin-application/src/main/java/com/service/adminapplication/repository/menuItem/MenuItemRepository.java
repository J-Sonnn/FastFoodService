package com.service.adminapplication.repository.menuItem;

import com.service.adminapplication.model.MenuItem;
import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing menu items in the fast food service.
 */
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

    /**
     * Retrieves a menu item by its unique identifier.
     *
     * @param id The unique identifier of the menu item.
     * @return An {@link Optional} containing the menu item, or empty if not found.
     */
    Optional<MenuItem> findById(@Nullable Long id);

    /**
     * Retrieves all menu items associated with a specific category.
     *
     * @param categoryId The unique identifier of the category.
     * @return A {@link List} of menu items associated with the specified category.
     */
    List<MenuItem> findAllByCategoryId(Long categoryId);

    /**
     * Updates a menu item by its unique identifier.
     *
     * @param id          The unique identifier of the menu item to be updated.
     * @param name        The new name for the menu item.
     * @param price       The new price for the menu item.
     * @param image       The new image for the menu item.
     * @param description The new description for the menu item.
     */
    @Modifying
    @Query("UPDATE MenuItem SET name = :name, price = :price, image = :image, description = :description WHERE id = :id")
    void updateMenuItemById(@Param("id") Long id, @Param("name") String name, @Param("price") float price, @Param("image") String image, @Param("description") String description);

    /**
     * Deletes a menu item by its unique identifier.
     *
     * @param id The unique identifier of the menu item to be deleted.
     */
    void deleteById(@Nullable Long id);

    /**
     * Deletes all menu items associated with a specific category.
     *
     * @param categoryId The unique identifier of the category.
     */
    void deleteAllByCategoryId(Long categoryId);

    /**
     * Deletes all menu items associated with a specific restaurant.
     *
     * @param restaurantId The unique identifier of the restaurant.
     */
    void deleteAllByRestaurantId(Long restaurantId);
}