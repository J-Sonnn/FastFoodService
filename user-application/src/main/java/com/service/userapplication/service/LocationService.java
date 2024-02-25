package com.service.userapplication.service;

import com.google.maps.DirectionsApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.TravelMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for handling location-related operations.
 */
@Service
public class LocationService {

    private GeoApiContext geoApiContext;

    /**
     * Constructor to initialize the GeoApiContext with the provided API key.
     *
     * @param apiKey The Google Maps API key.
     */
    @Autowired
    public LocationService(@Value("${google.api.key}") String apiKey) {
        this.geoApiContext = new GeoApiContext.Builder().apiKey(apiKey).build();
    }

    /**
     * Find the nearest restaurant to a given user address among a list of addresses.
     *
     * @param userAddress The user's address.
     * @param addresses   The list of restaurant addresses.
     * @return The address of the nearest restaurant.
     */
    public String findNearestRestaurant(String userAddress, List<String> addresses) {
        String nearestRestaurant = null;
        double minDistance = Double.MAX_VALUE;

        for (String address : addresses) {
            try {
                DirectionsResult result = DirectionsApi.newRequest(geoApiContext)
                        .mode(TravelMode.WALKING)
                        .origin(userAddress)
                        .destination(address)
                        .await();

                if (result.routes != null && result.routes.length > 0) {
                    double distance = result.routes[0].legs[0].distance.inMeters;

                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestRestaurant = address;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return nearestRestaurant;
    }
}