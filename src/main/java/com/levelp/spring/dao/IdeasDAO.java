package com.levelp.spring.dao;

import com.levelp.spring.model.Idea;
import com.levelp.spring.model.User;

import java.util.List;

/**
 * @author Anastasiya Solodkaya.
 */
public interface IdeasDAO {
    int add(Idea idea);

    int update(Idea idea);

    int delete(int id);

    Idea get(int id);

    List<Idea> list();

    boolean registerUser(User user);

    boolean isUserExists(String login);
}
