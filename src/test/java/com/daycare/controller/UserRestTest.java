package com.daycare.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.*;

class UserRestTest {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    void getMyBean() {
        Response response = null;
        UserRest userRest = new UserRest();
        String userId = "1";
        try  {
            response = userRest.getMyBeans(userId);
            assertEquals("OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}", response.toString());
        } catch (Exception exception)  {
            logger.error("Exception: ", exception);
        }

    }

    @Test
    void getMyBeans() {
        Response response = null;
        UserRest userRest = new UserRest();
        try  {
            response = (Response) userRest.getMyBean();
            assertEquals("OutboundJaxrsResponse{status=200, reason=OK, hasEntity=true, closed=false, buffered=false}", response.toString());
        } catch (Exception exception)  {
            logger.error("Exception: ", exception);
        }
    }
}