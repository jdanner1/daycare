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
        name = "EditUserAction",
        urlPatterns = { "/EditUserAction" }
)

public class EditUserActionServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.setAttribute("role", role);

        String url = "EditThisUser";
        response.sendRedirect(url);
    }
}


