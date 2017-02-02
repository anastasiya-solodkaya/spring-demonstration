package com.levelp.spring.dto.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Anastasiya Solodkaya.
 */
public class EmailValidator implements ConstraintValidator<ValidEmail, String> {


    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+" +
            "(.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(.[A-Za-z0-9]+)*" +
            "(.[A-Za-z]{2,})$";

    @Override
    public void initialize(ValidEmail validEmail) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
