package com.levelp.spring.dto;

import com.levelp.spring.dto.validation.PasswordsTheSame;
import com.levelp.spring.dto.validation.ValidEmail;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Anastasiya Solodkaya.
 */
@PasswordsTheSame
public class RegistrationUserDTO {
    @ValidEmail
    @NotEmpty(message = "Введите логин")
    private String login;
    @NotEmpty(message = "Введите пароль")
    private String password;

    private String password1;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }
}
