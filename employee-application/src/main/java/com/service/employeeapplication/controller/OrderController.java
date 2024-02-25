package com.service.employeeapplication.controller;

import com.service.employeeapplication.model.Order;
import com.service.employeeapplication.service.order.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Controller for handling operations related to orders.
 */
@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private final OrderService service;

    /**
     * Retrieve all orders for a given restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return ResponseEntity with a list of orders or no content if there are no orders.
     */
    @GetMapping("/get_all/{restaurantId}")
    public ResponseEntity<List<Order>> returnAllOrders(@PathVariable Long restaurantId) {
        List<Order> orders = service.findAllByRestaurantId(restaurantId);

        if (orders.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(orders);
    }

    /**
     * Retrieve details of a specific order.
     *
     * @param id The ID of the order.
     * @return Optional containing order details if found, empty otherwise.
     */
    @GetMapping("/get/{id}")
    public Optional<Order> returnOrder(@PathVariable Long id) {
        return service.findById(id);
    }

    /**
     * Update the status of a specific order.
     *
     * @param id           The ID of the order.
     * @param requestBody Map containing the new status.
     * @return ResponseEntity with a success message or an error message.
     */
    @PostMapping("/status/{id}")
    public ResponseEntity<String> updateStatus(@PathVariable Long id, @RequestBody Map<String, String> requestBody) {
        String newStatus = requestBody.get("newStatus");

        if (newStatus.equals("Delivered")) {
            service.deleteById(id);
            return ResponseEntity.ok("Order deleted successfully.");
        }

        service.updateStatusById(id, newStatus);
        return ResponseEntity.ok("Status updated successfully.");
    }
}