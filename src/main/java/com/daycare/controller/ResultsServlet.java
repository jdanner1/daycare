package com.daycare.controller;

import com.daycare.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
        name = "Results",
        urlPatterns = { "/Results" }
)

public class ResultsServlet extends HttpServlet {

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

        ServletContext context = getServletContext();

        String text = request.getParameter("main-input");
        String language = request.getParameter("language");
        String email = request.getParameter("email");
        boolean isEmailed = false;

        if (email.equals("Yes")) {
            isEmailed = true;
        }

        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        session.setAttribute("user", user);

        String url = "/role1/results.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
