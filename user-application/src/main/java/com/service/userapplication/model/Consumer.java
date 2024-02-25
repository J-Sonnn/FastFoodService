package com.service.userapplication.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a consumer entity.
 */
@Data
@Entity
@Table(name = "consumers")
public class Consumer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;

    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;
    private String password;

    @Column(name = "confirm_password")
    private String confirmPassword;

    private String city;
    private String street;

    @Column(name = "street_number")
    private String streetNumber;

    @Nullable
    @Column(name = "flat_number")
    private String flatNumber;
}