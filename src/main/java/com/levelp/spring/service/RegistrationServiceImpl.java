package com.levelp.spring.service;

import com.levelp.spring.dao.IdeasDAO;
import com.levelp.spring.dto.RegistrationUserDTO;
import com.levelp.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @author Anastasiya Solodkaya.
 */
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private IdeasDAO dao;

    @Override
    public boolean isUserExists(String login) {
        return dao.isUserExists(login);
    }

    @Override
    public RegistrationStatus register(RegistrationUserDTO dto) {
        try {
            User user = new User();

            user.setEmail(dto.getLogin());
            String salt = null;
            salt = generateSalt(20);
            user.setSalt(salt);
            byte[] hash = hash(salt + dto.getPassword());
            user.setPassword(hash);
            boolean result = dao.registerUser(user);
            if(result){
                return RegistrationStatus.OK;
            }

            return RegistrationStatus.DB_ERROR;
        } catch (NoSuchAlgorithmException e) {
            //TODO use logging
            e.printStackTrace();
            return RegistrationStatus.SERVER_ERROR;
        }
    }

    private byte[] hash(String fullPassword) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        digest.update(fullPassword.getBytes());
        byte[] result = digest.digest();
        return result;
    }

    private String generateSalt(int length) throws NoSuchAlgorithmException {
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[length];
        random.nextBytes(salt);
        return DatatypeConverter.printBase64Binary(salt);
    }
}
