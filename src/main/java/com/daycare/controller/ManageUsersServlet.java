package com.daycare.controller;

import com.daycare.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Controls the intake of page requests and forwards to the associated JSP.
 *
 * @author John Danner
 *
 */
@WebServlet(
        name = "ManageUsers",
        urlPatterns = {"/ManageUsers"}
)
public class ManageUsersServlet extends HttpServlet {

    /**
     * Forwards request and response objects to the JSP page.
     *
     * @param response - the HttpServletResponse object
     * @param request - the HttpServletRequest object
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<User> users;
        UserManager userManager = new UserManager();
        users = userManager.getUsers();

        HttpSession session = request.getSession();
        session.setAttribute("users", users);


        String url = "/role1/manage-users.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}



