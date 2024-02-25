package com.service.userapplication.repository.settings.address;

import com.service.userapplication.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repository interface for performing address-related operations on {@link Consumer} entities.
 */
public interface AddressRepository extends JpaRepository<Consumer, Long> {

    /**
     * Update the address of a consumer.
     *
     * @param id           The ID of the consumer.
     * @param city         The city to be updated.
     * @param street       The street to be updated.
     * @param streetNumber The street number to be updated.
     * @param flatNumber   The flat number to be updated.
     */
    @Modifying
    @Query("UPDATE Consumer u SET u.city = :city, u.street = :street, u.streetNumber = :streetNumber, u.flatNumber = :flatNumber WHERE u.id = :id")
    void updateAddress(@Param("id") Long id, @Param("city") String city, @Param("street") String street, @Param("streetNumber") String streetNumber, @Param("flatNumber") String flatNumber);
}