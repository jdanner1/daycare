package com.daycare.controller;



import com.daycare.entity.User;
import com.daycare.persistence.SessionFactoryProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserManager {
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    private final Logger logger = LogManager.getLogger(this.getClass());


    public List<User> getUsers() {
        List<User> users = null;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        users = session.createQuery(
                "select u from User u", User.class).getResultList();
        transaction.commit();
        session.close();
        return users;
    }
}