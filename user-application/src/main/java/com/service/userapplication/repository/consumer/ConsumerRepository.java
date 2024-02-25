package com.service.userapplication.repository.consumer;

import com.service.userapplication.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for performing CRUD operations on {@link Consumer} entities.
 */
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {}