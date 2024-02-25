package com.service.userapplication.service.settings.address;

import com.service.userapplication.dto.AddressRequest;

/**
 * Service interface for handling consumer address-related operations.
 */
public interface AddressService {

    /**
     * Update the address of a consumer.
     *
     * @param id             The ID of the consumer.
     * @param addressRequest The updated address details.
     */
    void updateAddress(Long id, AddressRequest addressRequest);
}