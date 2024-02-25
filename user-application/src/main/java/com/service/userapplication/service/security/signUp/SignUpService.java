package com.service.userapplication.service.security.signUp;

import com.service.userapplication.model.Consumer;

/**
 * Service interface for handling consumer signup-related operations.
 */
public interface SignUpService {

    /**
     * Save a new consumer.
     *
     * @param consumer The consumer object to be saved.
     */
    void saveConsumer(Consumer consumer);

    /**
     * Find a consumer by email.
     *
     * @param email The email of the consumer.
     * @return The Consumer object corresponding to the email.
     */
    Consumer findByEmail(String email);

    /**
     * Find a consumer by phone number.
     *
     * @param phoneNumber The phone number of the consumer.
     * @return The Consumer object corresponding to the phone number.
     */
    Consumer findByPhoneNumber(String phoneNumber);
}