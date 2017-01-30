package com.levelp.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Anastasiya Solodkaya.
 */
public class SimpleDBAccess {

    public SessionFactory sessionFactory;

    @Autowired
    public SimpleDBAccess(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public String getVersion(){
        Session session = sessionFactory.openSession();
        String version = (String) session.createSQLQuery("select version()").getSingleResult();
        session.close();
        return version;
    }
}
