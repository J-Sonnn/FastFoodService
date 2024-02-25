package com.service.userapplication.service.settings.password;

/**
 * Service interface for handling consumer password-related operations.
 */
public interface PasswordService {

    /**
     * Update the password of a consumer.
     *
     * @param id       The ID of the consumer.
     * @param password The new password.
     */
    void updatePassword(Long id, String password);

    /**
     * Update the confirmed password of a consumer.
     *
     * @param id             The ID of the consumer.
     * @param confirmPassword The new confirmed password.
     */
    void updateConfirmPassword(Long id, String confirmPassword);
}