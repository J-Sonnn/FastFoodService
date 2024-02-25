package com.service.userapplication.service.consumer;

import com.service.userapplication.model.Consumer;

/**
 * Service interface for performing operations related to consumers.
 */
public interface ConsumerService {

    /**
     * Find a consumer by ID.
     *
     * @param id The ID of the consumer.
     * @return The found consumer or null if not found.
     */
    Consumer findById(Long id);
}