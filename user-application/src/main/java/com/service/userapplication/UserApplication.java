package com.service.userapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main application class for the Consumer Application.
 * This class contains the entry point for starting the Spring Boot application.
 */
@SpringBootApplication
public class UserApplication {

    /**
     * The main method to start the Spring Boot application.
     *
     * @param args The command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}

/*
   _____               ____
  /\___ \             /\  _`\
  \/__/\ \           \ \,\L\_\   ___     ___
     _\ \ \   ______  \/_\__ \  / __`\ /' _ `\
    /\ \_\ \ /\______\ /\ \L\ \/\ \L\ \/\ \/\ \
    \ \____/ \/______/ \ `\____\ \____/\ \_\ \_\
     \/___/             \/_____/\/___/  \/_/\/_/
 */