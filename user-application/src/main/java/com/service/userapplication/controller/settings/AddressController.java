package com.service.userapplication.controller.settings;

import com.service.userapplication.dto.AddressRequest;
import com.service.userapplication.model.Consumer;
import com.service.userapplication.service.consumer.ConsumerService;
import com.service.userapplication.service.settings.address.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller handling operations related to consumer addresses.
 */
@RestController
@RequestMapping("/settings")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;
    private final ConsumerService consumerService;

    /**
     * Retrieve the address details for a consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return AddressRequest containing address details.
     */
    @GetMapping("/address/{consumerId}")
    public AddressRequest returnAddress(@PathVariable Long consumerId) {
        Consumer consumer = consumerService.findById(consumerId);
        return new AddressRequest(consumer.getCity(), consumer.getStreet(), consumer.getStreetNumber(), consumer.getFlatNumber());
    }

    /**
     * Update the address for a consumer.
     *
     * @param addressRequest The new address details.
     * @param consumerId     The ID of the consumer.
     * @return ResponseEntity with a success or error message.
     */
    @PostMapping("/address/{consumerId}")
    public ResponseEntity<String> updateAddress(@RequestBody AddressRequest addressRequest, @PathVariable Long consumerId) {
        try {
            addressService.updateAddress(consumerId, addressRequest);
            return ResponseEntity.ok("Address updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error updating address.");
        }
    }
}