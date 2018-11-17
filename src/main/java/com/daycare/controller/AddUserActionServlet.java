package com.daycare.controller;

import com.daycare.entity.Role;
import com.daycare.entity.User;
import com.daycare.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**  Servlet handles new user submissions, creating the user and sending user back to management utility
 *
 *
 *@author    John Danner
 */
@WebServlet(
        name = "AddUserAction",
        urlPatterns = { "/AddUserAction" }
)

public class AddUserActionServlet extends HttpServlet {

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

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String selectedRole = request.getParameter("role");

        User user = new User(userName, password);
        genericDao.addEntity(user);
        Role role = new Role(selectedRole, userName, user);
        genericDao2.addEntity(role);

        String url = "ManageUsers";
        response.sendRedirect(url);

    }
}
