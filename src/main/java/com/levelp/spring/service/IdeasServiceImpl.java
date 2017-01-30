package com.levelp.spring.service;

import com.levelp.spring.dao.IdeasDAO;
import com.levelp.spring.model.Idea;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Anastasiya Solodkaya.
 */
public class IdeasServiceImpl implements IdeasService {
    @Autowired
    IdeasDAO dao;

    public int add(Idea idea) {
        return dao.add(idea);
    }

    public int update(Idea idea) {
        return dao.update(idea);
    }

    public int delete(int id) {
        return dao.delete(id);
    }

    public Idea get(int id) {
        return dao.get(id);
    }

    public List<Idea> list() {
        return dao.list();
    }
}
