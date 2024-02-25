package com.service.userapplication.service.settings.address.Impl;

import com.service.userapplication.dto.AddressRequest;
import com.service.userapplication.repository.settings.address.AddressRepository;
import com.service.userapplication.service.settings.address.AddressService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Service implementation for handling consumer address-related operations.
 */
@Service
@AllArgsConstructor
@Primary
public class AddressServiceImpl implements AddressService {

    private final AddressRepository repository;

    /**
     * Update the address of a consumer.
     *
     * @param id             The ID of the consumer.
     * @param addressRequest The updated address details.
     */
    @Transactional
    @Override
    public void updateAddress(Long id, AddressRequest addressRequest) {
        repository.updateAddress(id, addressRequest.getCity(), addressRequest.getStreet(), addressRequest.getStreetNumber(), addressRequest.getFlatNumber());
    }
}