package com.daycare.controller;

import com.daycare.entity.User;
import com.daycare.persistence.SessionFactoryProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/**
 * The type User manager.
 * @author John Danner
 */
public class UserManager {
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    private final Logger logger = LogManager.getLogger(this.getClass());


    /**
     * Gets users.
     *
     * @return the users
     */
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