package com.service.userapplication.service.settings.password.Impl;

import com.service.userapplication.repository.settings.password.PasswordRepository;
import com.service.userapplication.service.settings.password.PasswordService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Service implementation for handling consumer password-related operations.
 */
@Service
@AllArgsConstructor
@Primary
@Transactional
public class PasswordServiceImpl implements PasswordService {

    private final PasswordRepository repository;

    /**
     * Update the password of a consumer.
     *
     * @param id       The ID of the consumer.
     * @param password The new password.
     */
    @Override
    public void updatePassword(Long id, String password) {
        repository.updatePassword(id, password);
    }

    /**
     * Update the confirmed password of a consumer.
     *
     * @param id             The ID of the consumer.
     * @param confirmPassword The new confirmed password.
     */
    @Override
    public void updateConfirmPassword(Long id, String confirmPassword) {
        repository.updateConfirmPassword(id, confirmPassword);
    }
}