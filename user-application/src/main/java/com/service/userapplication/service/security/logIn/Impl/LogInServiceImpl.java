package com.service.userapplication.service.security.logIn.Impl;

import com.service.userapplication.model.Consumer;
import com.service.userapplication.repository.security.logIn.LogInRepository;
import com.service.userapplication.service.security.logIn.LogInService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Service implementation for handling consumer login-related operations.
 */
@Service
@AllArgsConstructor
@Primary
public class LogInServiceImpl implements LogInService {

    private final LogInRepository repository;

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
     * Authenticate a consumer based on email and password.
     *
     * @param email    The email of the consumer.
     * @param password The password of the consumer.
     * @return true if authentication is successful, false otherwise.
     */
    @Override
    public boolean authenticateUser(String email, String password) {
        Consumer consumer = repository.findByEmail(email);

        return consumer != null && Objects.equals(password, consumer.getPassword());
    }
}