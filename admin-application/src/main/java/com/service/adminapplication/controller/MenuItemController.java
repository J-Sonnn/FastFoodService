package com.service.adminapplication.controller;

import com.service.adminapplication.dto.MenuItemRequest;
import com.service.adminapplication.model.MenuItem;
import com.service.adminapplication.service.menuItem.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller handling operations related to menu items.
 */
@RestController
@RequestMapping("/menu_item")
@AllArgsConstructor
public class MenuItemController {

    private final MenuItemService service;

    /**
     * Retrieve a list of all menu items for a specific category.
     *
     * @param categoryId The ID of the category.
     * @return List of MenuItem objects.
     */
    @GetMapping("/get_all/{categoryId}")
    public List<MenuItem> returnAllMenuItems(@PathVariable Long categoryId) {
        return service.findAllByCategoryId(categoryId);
    }

    /**
     * Save a new menu item.
     *
     * @param menuItem The MenuItem object to be saved.
     */
    @PostMapping("/add")
    public void saveMenuItem(@RequestBody MenuItem menuItem) {
        service.saveMenuItem(menuItem);
    }

    /**
     * Update details of an existing menu item.
     *
     * @param menuItemRequest The request containing updated details.
     * @param id              The ID of the menu item to be updated.
     */
    @PostMapping("/update/{id}")
    public void updateMenuItem(@RequestBody MenuItemRequest menuItemRequest, @PathVariable Long id) {
        service.updateMenuItemById(id, menuItemRequest.getName(), menuItemRequest.getPrice(), menuItemRequest.getImage(), menuItemRequest.getDescription());
    }

    /**
     * Delete a menu item by its ID.
     *
     * @param id The ID of the menu item to be deleted.
     */
    @GetMapping("/delete/{id}")
    public void deleteMenuItem(@PathVariable Long id){
        service.deleteById(id);
    }
}