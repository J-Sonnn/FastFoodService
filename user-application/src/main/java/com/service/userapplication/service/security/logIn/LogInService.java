package com.service.userapplication.service.security.logIn;

import com.service.userapplication.model.Consumer;

/**
 * Service interface for handling consumer login-related operations.
 */
public interface LogInService {

    /**
     * Find a consumer by email.
     *
     * @param email The email of the consumer.
     * @return The Consumer object corresponding to the email.
     */
    Consumer findByEmail(String email);

    /**
     * Authenticate a consumer based on email and password.
     *
     * @param email    The email of the consumer.
     * @param password The password of the consumer.
     * @return true if authentication is successful, false otherwise.
     */
    boolean authenticateUser(String email, String password);
}