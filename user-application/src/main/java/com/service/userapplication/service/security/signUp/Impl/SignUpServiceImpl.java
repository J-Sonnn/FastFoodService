package com.service.userapplication.service.security.signUp.Impl;

import com.service.userapplication.model.Consumer;
import com.service.userapplication.repository.security.signUp.SignUpRepository;
import com.service.userapplication.service.security.signUp.SignUpService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Service implementation for handling consumer signup-related operations.
 */
@Service
@AllArgsConstructor
@Primary
public class SignUpServiceImpl implements SignUpService {

    private final SignUpRepository repository;

    /**
     * Save a new consumer.
     *
     * @param consumer The consumer object to be saved.
     */
    @Override
    public void saveConsumer(Consumer consumer) {
        repository.save(consumer);
    }

    /**
     * Find a consumer by email.
     *
     * @param email The email of the consumer.
     * @return The Consumer object corresponding to the email.
     */
    @Override
    public Consumer findByEmail(String email) {
        return repository.findByEmail(email);
    }

    /**
     * Find a consumer by phone number.
     *
     * @param phoneNumber The phone number of the consumer.
     * @return The Consumer object corresponding to the phone number.
     */
    @Override
    public Consumer findByPhoneNumber(String phoneNumber) {
        return repository.findByPhoneNumber(phoneNumber);
    }
}