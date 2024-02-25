package com.service.userapplication.repository.settings.personalData;

import com.service.userapplication.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repository interface for performing personal data-related operations on {@link Consumer} entities.
 */
public interface PersonalDataRepository extends JpaRepository<Consumer, Long> {

    /**
     * Update the personal data of a consumer.
     *
     * @param id       The ID of the consumer.
     * @param newName  The new name to be set.
     * @param newSurname The new surname to be set.
     * @param newEmail The new email to be set.
     */
    @Modifying
    @Query("UPDATE Consumer u SET u.name = :newName, u.surname = :newSurname, u.email = :newEmail WHERE u.id = :id")
    void updatePersonalData(@Param("id") Long id, @Param("newName") String newName, @Param("newSurname") String newSurname, @Param("newEmail") String newEmail);
}