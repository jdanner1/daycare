package com.daycare.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserMonitorTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    void getClasses() {
        Set<Class<?>> classes = null;
        UserMonitor userMonitor = new UserMonitor();
        classes = userMonitor.getClasses();
        for(Class<?> currentClass : classes)  {
            assertNotNull(currentClass);
            logger.info("Current Class: " + currentClass.toString());
        }
    }
}