package com.daycare.controller;

import com.daycare.entity.User;
import com.daycare.persistence.GenericDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/userRest")
public class UserRest {
    private GenericDao genericDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{userId}")
    public String getMyBeans(@PathParam("userId") String userId) throws Exception {
        genericDao = new GenericDao(User.class);
        String jsonUsers = "";
        int id = Integer.parseInt(userId);
        User user = (User)genericDao.getEntityByID(id);
        ObjectMapper mapper = new ObjectMapper();
        jsonUsers = mapper.writeValueAsString(user);

        return jsonUsers;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMyBean() throws Exception {
        genericDao = new GenericDao(User.class);
        String jsonUsers = "";
        List<User> users = genericDao.getAll();
        ObjectMapper mapper = new ObjectMapper();
        jsonUsers = mapper.writeValueAsString(users);

        return jsonUsers;
    }
}

/*
@Path("/helloParam")
public class HelloParam {

    @GET
    @Produces("text/plain")
    @Path("{firstName}/{lastName}")
    public Response getDate(
            @PathParam("firstName") String firstName,
            @PathParam("lastName") String lastName) {

        String output = "Hello " + firstName + " " + lastName;
        return Response.status(200).entity(output).build();
    }
}
 */
