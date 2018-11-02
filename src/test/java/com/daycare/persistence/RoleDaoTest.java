package com.daycare.persistence;

import com.daycare.entity.Role;
import com.daycare.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;



class RoleDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private GenericDao genericDao;
    private GenericDao genericDao2;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Role.class);
        genericDao2 = new GenericDao(User.class);
        TestUserGenerator testUser = new TestUserGenerator();
        testUser.initializeUser();
    }

    @Test
    void addRole() {
        User user = (User)genericDao2.getEntityByID(2);
        String roleName = "role1";
        String userName = "employee2";
        int userID = 2;

        Role role = new Role(roleName, userName, user);

        int roleID = genericDao.addEntity(role);
        assertNotEquals(0, roleID);
        Role addedRole = (Role)genericDao.getEntityByID(roleID);
        assertEquals(role, addedRole);
        logger.info("Role Info: " + addedRole.toString());
    }



    @Test
    void getRoleByID() {
        Role retrievedRole = (Role)genericDao.getEntityByID(1);
        assertNotNull(retrievedRole);
        assertEquals(genericDao.getEntityByID(1), retrievedRole);
        logger.info("Role Info: " + retrievedRole.toString());
    }

    @Test
    void updateRole() {
        String newRole = "admin";
        Role role = (Role)genericDao.getEntityByID(1);
        role.setRoleName(newRole);
        genericDao.updateEntity(role);
        Role retrievedRole = (Role)genericDao.getEntityByID(1);
        assertEquals(role, retrievedRole);
        logger.info("Role Info: " + retrievedRole.toString());
    }



    @Test
    void deleteRole() {
        genericDao.deleteEntity(genericDao.getEntityByID(1));
        assertNull(genericDao.getEntityByID(1));
    }

}