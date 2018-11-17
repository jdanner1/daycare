package com.daycare.controller;

import com.daycare.entity.User;
import com.daycare.persistence.GenericDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * The type User rest.
 * @author John Danner
 */
@Path("/users")
public class UserRest {
    private GenericDao genericDao;

    /**
     * Gets my bean.
     *
     * @return the my bean
     * @throws Exception the exception
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMyBean() throws Exception {
        genericDao = new GenericDao(User.class);
        String jsonUsers = "";
        List<User> users = genericDao.getAll();
        ObjectMapper mapper = new ObjectMapper();
        jsonUsers = mapper.writeValueAsString(users);

        return Response.status(200).entity(jsonUsers).build();
    }

    /**
     * Gets my beans.
     *
     * @param userId the user id
     * @return the my beans
     * @throws Exception the exception
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{userId}")
    public Response getMyBeans(@PathParam("userId") String userId) throws Exception {
        genericDao = new GenericDao(User.class);
        String jsonUsers = "";
        int id = Integer.parseInt(userId);
        User user = (User)genericDao.getEntityByID(id);
        ObjectMapper mapper = new ObjectMapper();
        jsonUsers = mapper.writeValueAsString(user);

        return Response.status(200).entity(jsonUsers).build();
    }
}


