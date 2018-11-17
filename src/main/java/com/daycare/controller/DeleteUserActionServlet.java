package com.daycare.controller;

import com.daycare.entity.Role;
import com.daycare.entity.User;
import com.daycare.persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Handles requests to delete a user, deletes and sends user back to management utility.
 *
 *@author    John Danner
 */
@WebServlet(
        name = "DeleteUserAction",
        urlPatterns = { "/DeleteUserAction" }
)

public class DeleteUserActionServlet extends HttpServlet {

    private GenericDao genericDao;
    private GenericDao genericDao2;

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               the HttpRequest
     *@param  response              the HttpResponse
     *@exception ServletException  if there is a general
     *                              servlet exception
     *@exception IOException       if there is a general
     *                              I/O exception
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        genericDao = new GenericDao(User.class);
        genericDao2 = new GenericDao(Role.class);

        int userId = Integer.parseInt(request.getParameter("userName"));
        User user = (User)genericDao.getEntityByID(userId);
        Role role = (Role)genericDao2.getEntityByID(user.getUserId());
        genericDao2.deleteEntity(role);
        genericDao.deleteEntity(user);

        String url = "ManageUsers";
        response.sendRedirect(url);
    }
}

