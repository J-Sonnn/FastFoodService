package com.service.userapplication.controller.menu;

import com.service.userapplication.model.Cart;
import com.service.userapplication.model.Consumer;
import com.service.userapplication.service.menu.cart.CartService;
import com.service.userapplication.service.consumer.ConsumerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller handling operations related to the consumer's cart.
 */
@RestController
@RequestMapping("/cart")
@AllArgsConstructor
public class CartController {

    private final CartService cartService;
    private final ConsumerService consumerService;

    /**
     * Get all menu items from the cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return List of Cart objects.
     */
    @GetMapping("/get_all/{consumerId}")
    public List<Cart> returnAllMenuItemsFromCart(@PathVariable Long consumerId) {
        return cartService.findAllByConsumerId(consumerId);
    }

    /**
     * Save a cart for a consumer.
     *
     * @param cart The Cart object to be saved.
     */
    @PostMapping("/save")
    public void saveCart(@RequestBody Cart cart) {
        cartService.saveCart(cart);
    }

    /**
     * Delete all items from the cart for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     */
    @GetMapping("/delete/{consumerId}")
    public void deleteCart(@PathVariable Long consumerId) {
        cartService.deleteAllByConsumerId(consumerId);
    }

    /**
     * Get consumer address details for confirmation.
     *
     * @param consumerId The ID of the consumer.
     * @return Map containing address details (city, street, streetNumber, flatNumber).
     */
    @GetMapping("/confirmation/{consumerId}")
    public Map<String, String> returnConsumerAddress(@PathVariable Long consumerId) {
        Map<String, String> addressDetails = new HashMap<>();
        Consumer consumer = consumerService.findById(consumerId);

        addressDetails.put("city", consumer.getCity());
        addressDetails.put("street", consumer.getStreet());
        addressDetails.put("streetNumber", consumer.getStreetNumber());
        addressDetails.put("flatNumber", consumer.getFlatNumber());

        return addressDetails;
    }
}