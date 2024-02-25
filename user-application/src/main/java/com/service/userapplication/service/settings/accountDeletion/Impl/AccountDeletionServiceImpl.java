package com.service.userapplication.service.settings.accountDeletion.Impl;

import com.service.userapplication.repository.settings.accountDeletion.AccountDeletionRepository;
import com.service.userapplication.service.settings.accountDeletion.AccountDeletionService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Service implementation for handling consumer account deletion-related operations.
 */
@Service
@AllArgsConstructor
@Primary
public class AccountDeletionServiceImpl implements AccountDeletionService {

    private final AccountDeletionRepository repository;

    /**
     * Delete a consumer account by its ID.
     *
     * @param id The ID of the consumer account to be deleted.
     */
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}