package com.service.userapplication.controller.order;

import com.service.userapplication.model.Order;
import com.service.userapplication.service.menu.cart.CartService;
import com.service.userapplication.service.menu.menuItem.MenuItemService;
import com.service.userapplication.service.order.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller handling operations related to orders.
 */
@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final CartService cartService;
    private final MenuItemService menuItemService;

    /**
     * Get all orders for a specific consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return ResponseEntity containing a list of Order objects.
     */
    @GetMapping("/get_all/{consumerId}")
    public ResponseEntity<List<Order>> returnAllOrders(@PathVariable Long consumerId) {
        List<Order> orders = orderService.findAllByConsumerId(consumerId);

        if (orders.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(orders);
    }

    /**
     * Save a new order for a consumer.
     *
     * @param consumerId The ID of the consumer placing the order.
     */
    @PostMapping("/add/{consumerId}")
    public void saveOrder(@PathVariable Long consumerId) {
        List<Long> menuItemsId = cartService.findAllMenuItemsByConsumerId(consumerId);
        Long menuItemId = menuItemsId.get(0);

        Order order = new Order();
        order.setRestaurantId(menuItemService.findRestaurantIdById(menuItemId));
        order.setConsumerId(consumerId);
        order.setMenuItemId(menuItemsId);

        orderService.saveOrder(order);
        cartService.deleteAllByConsumerId(consumerId);
    }
}