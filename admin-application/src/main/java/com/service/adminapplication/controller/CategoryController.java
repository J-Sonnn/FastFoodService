package com.service.adminapplication.controller;

import com.service.adminapplication.model.Category;
import com.service.adminapplication.service.category.CategoryService;
import com.service.adminapplication.service.menuItem.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller handling operations related to categories.
 */
@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService service;
    private final MenuItemService menuItemService;

    /**
     * Retrieve a list of all categories for a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return List of Category objects.
     */
    @GetMapping("/get_all/{restaurantId}")
    public List<Category> returnAllCategories(@PathVariable Long restaurantId) {
        return service.findAllByRestaurantId(restaurantId);
    }

    /**
     * Save a new category.
     *
     * @param category The Category object to be saved.
     */
    @PostMapping("/add")
    public void saveCategory(@RequestBody Category category) {
        service.saveCategory(category);
    }

    /**
     * Delete a category by its ID, along with associated menu items.
     *
     * @param id The ID of the category to be deleted.
     */
    @GetMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id){
        service.deleteById(id);
        menuItemService.deleteAllByCategoryId(id);
    }
}