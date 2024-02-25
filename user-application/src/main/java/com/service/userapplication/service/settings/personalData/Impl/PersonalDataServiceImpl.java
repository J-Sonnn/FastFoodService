package com.service.userapplication.service.settings.personalData.Impl;

import com.service.userapplication.dto.PersonalDataRequest;
import com.service.userapplication.repository.settings.personalData.PersonalDataRepository;
import com.service.userapplication.service.settings.personalData.PersonalDataService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service implementation for handling consumer personal data operations.
 */
@Service
@AllArgsConstructor
@Primary
@Transactional
public class PersonalDataServiceImpl implements PersonalDataService {

    private final PersonalDataRepository repository;

    /**
     * Update the personal data of a consumer.
     *
     * @param id                  The ID of the consumer.
     * @param personalDataRequest The new personal data.
     */
    @Override
    public void updatePersonalData(Long id, PersonalDataRequest personalDataRequest) {
        repository.updatePersonalData(id, personalDataRequest.getName(), personalDataRequest.getSurname(), personalDataRequest.getEmail());
    }
}