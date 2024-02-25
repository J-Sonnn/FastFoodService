package com.service.userapplication.repository.settings.accountDeletion;

import com.service.userapplication.model.Consumer;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for performing account deletion related operations on {@link Consumer} entities.
 */
public interface AccountDeletionRepository extends JpaRepository<Consumer, Long> {

    /**
     * Delete a consumer by their ID.
     *
     * @param id The ID of the consumer to be deleted.
     */
    void deleteById(@Nullable Long id);
}