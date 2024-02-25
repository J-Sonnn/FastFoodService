package com.service.userapplication.service.settings.personalData;

import com.service.userapplication.dto.PersonalDataRequest;

/**
 * Service interface for handling consumer personal data operations.
 */
public interface PersonalDataService {

    /**
     * Update the personal data of a consumer.
     *
     * @param id                  The ID of the consumer.
     * @param personalDataRequest The new personal data.
     */
    void updatePersonalData(Long id, PersonalDataRequest personalDataRequest);
}