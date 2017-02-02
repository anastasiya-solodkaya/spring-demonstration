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
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface ValidEmail {
    String message() default "Введите валидный e-mail";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
