package com.daycare.controller;

import com.daycare.entity.Role;
import com.daycare.entity.User;
import com.daycare.persistence.GenericDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 *
 *
 *@author    John Danner
 */
@WebServlet(
        name = "EditThisUserAction",
        urlPatterns = { "/EditThisUserAction" }
)

public class EditThisUserActionServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Role role = (Role)session.getAttribute("role");

        String newUserName = request.getParameter("userName");
        String newPassword = request.getParameter("password");
        String newRole = request.getParameter("role");

        user.setUserName(newUserName);
        user.setPassword(newPassword);
        genericDao.updateEntity(user);

        role.setRoleName(newRole);
        genericDao2.updateEntity(role);

        String url = "ManageUsers";
        response.sendRedirect(url);
    }
}

