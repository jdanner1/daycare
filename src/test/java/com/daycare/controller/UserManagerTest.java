package com.daycare.controller;

import com.daycare.entity.Role;
import com.daycare.entity.User;
import com.daycare.persistence.GenericDao;
import com.daycare.persistence.TestUserGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    private final Logger logger = LogManager.getLogger(this.getClass());


    @BeforeEach
    void setUp() {
        TestUserGenerator testUser = new TestUserGenerator();
        testUser.initializeUser();
    }

    @Test
    void getUsers() {
        List<User> users;
        UserManager userManager = new UserManager();
        users = userManager.getUsers();
        int userCount = users.size();
        assertEquals(2, userCount);
        logger.info("Number of users: ", userCount);
    }

}