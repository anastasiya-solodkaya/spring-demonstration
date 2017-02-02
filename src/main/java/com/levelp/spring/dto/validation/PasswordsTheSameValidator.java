package com.levelp.spring.dto.validation;

import com.levelp.spring.dto.RegistrationUserDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Anastasiya Solodkaya.
 */
public class PasswordsTheSameValidator implements ConstraintValidator<PasswordsTheSame, RegistrationUserDTO> {
    @Override
    public void initialize(PasswordsTheSame passwordsTheSame) {

    }

    @Override
    public boolean isValid(RegistrationUserDTO registrationUserDTO, ConstraintValidatorContext constraintValidatorContext) {
        return registrationUserDTO.getPassword().equals(registrationUserDTO.getPassword1());
    }
}
