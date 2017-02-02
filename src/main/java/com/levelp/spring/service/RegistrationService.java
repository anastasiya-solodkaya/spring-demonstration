package com.levelp.spring.service;

import com.levelp.spring.dto.RegistrationUserDTO;

/**
 * @author Anastasiya Solodkaya.
 */
public interface RegistrationService {

    boolean isUserExists(String login);

    enum RegistrationStatus{
        OK, VALIDATION_ERROR, DUPLICATE, DB_ERROR, SERVER_ERROR
    }

    RegistrationStatus register(RegistrationUserDTO dto);
}
