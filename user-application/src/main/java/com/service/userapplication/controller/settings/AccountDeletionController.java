package com.service.userapplication.controller.settings;

import com.service.userapplication.service.settings.accountDeletion.AccountDeletionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller handling account deletion related operations.
 */
@RestController
@RequestMapping("/settings")
@AllArgsConstructor
public class AccountDeletionController {

    private final AccountDeletionService accountDeletionService;

    /**
     * Delete a consumer account by its ID.
     *
     * @param consumerId The ID of the consumer account to be deleted.
     * @return ResponseEntity with a success message.
     */
    @GetMapping("/delete/{consumerId}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long consumerId) {
        accountDeletionService.deleteById(consumerId);
        return ResponseEntity.ok("Account deleted successfully.");
    }
}