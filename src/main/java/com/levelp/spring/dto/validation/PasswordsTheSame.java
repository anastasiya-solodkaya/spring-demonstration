package com.levelp.spring.dto.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Anastasiya Solodkaya.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordsTheSameValidator.class)
public @interface PasswordsTheSame {
    String message() default "Пароли не совпадают";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
