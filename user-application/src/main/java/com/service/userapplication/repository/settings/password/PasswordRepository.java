package com.service.userapplication.repository.settings.password;

import com.service.userapplication.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repository interface for performing password-related operations on {@link Consumer} entities.
 */
public interface PasswordRepository extends JpaRepository<Consumer, Long> {

    /**
     * Update the password of a consumer.
     *
     * @param id       The ID of the consumer.
     * @param password The new password to be set.
     */
    @Modifying
    @Query("UPDATE Consumer u SET u.password = :password WHERE u.id = :id")
    void updatePassword(@Param("id") Long id, @Param("password") String password);

    /**
     * Update the confirmation password of a consumer.
     *
     * @param id              The ID of the consumer.
     * @param confirmPassword The new confirmation password to be set.
     */
    @Modifying
    @Query("UPDATE Consumer u SET u.confirmPassword = :confirmPassword WHERE u.id = :id")
    void updateConfirmPassword(@Param("id") Long id, @Param("confirmPassword") String confirmPassword);
}