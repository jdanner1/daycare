package com.daycare.persistence;

import com.daycare.entity.Role;
import com.daycare.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;



class UserDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private GenericDao genericDao;
    private GenericDao genericDao2;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(User.class);
        genericDao2 = new GenericDao(Role.class);
        TestUserGenerator testUser = new TestUserGenerator();
        testUser.initializeUser();
    }

    @Test
    void addUser() {
        User user = new User("employee3", "daycare");
        int userID = genericDao.addEntity(user);
        assertNotEquals(0, userID);
        User addedUser = (User)genericDao.getEntityByID(userID);
        assertEquals("employee3", addedUser.getUserName());
    }


    @Test
    void getUserByID() {
        User retrievedUser = (User)genericDao.getEntityByID(1);
        assertNotNull(retrievedUser);
        assertEquals(genericDao.getEntityByID(1), retrievedUser);
        logger.info("User Info: " + retrievedUser.toString());
    }

    @Test
    void updateUser() {
        String newUserName = "employee3";
        String newPassword = "daycare2";
        User user = (User)genericDao.getEntityByID(1);
        user.setUserName(newUserName);
        user.setPassword(newPassword);
        genericDao.updateEntity(user);
        User retrievedUser = (User)genericDao.getEntityByID(1);
        assertEquals(user, retrievedUser);
        logger.info("User Info: " + retrievedUser.toString());
    }

    @Test
    void deleteUser() {
        genericDao.deleteEntity(genericDao.getEntityByID(2));
        assertNull(genericDao.getEntityByID(2));
    }
}


