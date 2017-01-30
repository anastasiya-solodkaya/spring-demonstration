package com.levelp.spring.dao;

import com.levelp.spring.model.Idea;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * @author Anastasiya Solodkaya.
 */
public class IdeasDAOImpl implements IdeasDAO {

    @Autowired
    SessionFactory factory;

    @Override
    public int add(Idea idea) {
        Session session = factory.openSession();
        Serializable id = session.save(idea);
        return (Integer)id;
    }

    @Override
    public int update(Idea idea) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Idea get(int id) {
        return null;
    }

    @Override
    public List<Idea> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<Idea> list = session.createQuery("from Idea").list();
        return list;
    }
}
