package com.service.userapplication.controller.menu;

import com.service.userapplication.model.MenuItem;
import com.service.userapplication.service.menu.menuItem.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * Get all menu items for a specific category.
     *
     * @param categoryId The ID of the category.
     * @return List of MenuItem objects.
     */
    @GetMapping("/get_all/{categoryId}")
    public List<MenuItem> returnAllMenuItems(@PathVariable Long categoryId) {
        return service.findAllByCategoryId(categoryId);
    }
}