package com.service.userapplication.service.consumer.Impl;

import com.service.userapplication.model.Consumer;
import com.service.userapplication.repository.consumer.ConsumerRepository;
import com.service.userapplication.service.consumer.ConsumerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Service implementation for performing operations related to consumers.
 */
@Service
@AllArgsConstructor
@Primary
public class ConsumerServiceImpl implements ConsumerService {

    private final ConsumerRepository repository;

    /**
     * Find a consumer by ID.
     *
     * @param id The ID of the consumer.
     * @return The found consumer or null if not found.
     */
    @Override
    public Consumer findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}