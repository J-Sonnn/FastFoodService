package com.service.userapplication.service.settings.accountDeletion;

/**
 * Service interface for handling consumer account deletion-related operations.
 */
public interface AccountDeletionService {

    /**
     * Delete a consumer account by its ID.
     *
     * @param id The ID of the consumer account to be deleted.
     */
    void deleteById(Long id);
}