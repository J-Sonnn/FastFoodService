package com.service.userapplication.controller.settings;

import com.service.userapplication.dto.PersonalDataRequest;
import com.service.userapplication.model.Consumer;
import com.service.userapplication.service.consumer.ConsumerService;
import com.service.userapplication.service.settings.personalData.PersonalDataService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller handling operations related to consumer personal data.
 */
@RestController
@RequestMapping("/settings")
@AllArgsConstructor
public class PersonalDataController {

    private final PersonalDataService personalDataService;
    private final ConsumerService consumerService;

    /**
     * Retrieve personal data for a consumer.
     *
     * @param consumerId The ID of the consumer.
     * @return PersonalDataRequest containing the consumer's name, surname, and email.
     */
    @GetMapping("/personal_data/{consumerId}")
    public PersonalDataRequest returnPersonalData(@PathVariable Long consumerId) {

        Consumer consumer = consumerService.findById(consumerId);
        return new PersonalDataRequest(consumer.getName(), consumer.getSurname(), consumer.getEmail());
    }

    /**
     * Update personal data for a consumer.
     *
     * @param personalDataRequest The request containing updated personal data.
     * @param consumerId          The ID of the consumer.
     * @return ResponseEntity with a success or error message.
     */
    @PostMapping("/personal_data/{consumerId}")
    public ResponseEntity<String> updatePersonalData(@RequestBody PersonalDataRequest personalDataRequest, @PathVariable Long consumerId) {

        try {
            // Update personal data using the service
            personalDataService.updatePersonalData(consumerId, personalDataRequest);
            return ResponseEntity.ok("Personal data updated successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to update personal data");
        }
    }
}