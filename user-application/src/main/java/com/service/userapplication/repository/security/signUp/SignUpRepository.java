package com.service.userapplication.repository.security.signUp;

import com.service.userapplication.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for performing CRUD operations on {@link Consumer} entities related to sign-up functionality.
 */
public interface SignUpRepository extends JpaRepository<Consumer, Long> {

    /**
     * Retrieve a consumer by their email.
     *
     * @param email The email of the consumer.
     * @return Consumer object or null if not found.
     */
    Consumer findByEmail(String email);

    /**
     * Retrieve a consumer by their phone number.
     *
     * @param phoneNumber The phone number of the consumer.
     * @return Consumer object or null if not found.
     */
    Consumer findByPhoneNumber(String phoneNumber);
}