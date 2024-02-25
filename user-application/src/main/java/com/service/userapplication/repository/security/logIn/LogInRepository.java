package com.service.userapplication.repository.security.logIn;

import com.service.userapplication.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for performing CRUD operations on {@link Consumer} entities related to log in functionality.
 */
public interface LogInRepository extends JpaRepository<Consumer, Long> {

    /**
     * Retrieve a consumer by their email.
     *
     * @param email The email of the consumer.
     * @return Consumer object or null if not found.
     */
    Consumer findByEmail(String email);
}