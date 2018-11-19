package com.daycare.controller;

import com.daycare.Results;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        name = "Home",
        urlPatterns = {"/Home"}
)
public class HomeServlet extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Forwards request and response objects to the JSP page.
     * @param response - the HttpServletResponse object
     * @param request - the HttpServletRequest object
     * @exception ServletException  if there is a general
     *                              servlet exception
     * @exception IOException       if there is a general
     *                              I/O exception
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Results> results = null;
        ServiceManager serviceManager = new ServiceManager();
        String serviceResponse = serviceManager.getStudentList();
        HttpSession session = request.getSession();

        results = serviceManager.createStudentResults(serviceResponse);
        if (results == null) {
            String message1 = "There was an error retrieving the current student list";
            session.setAttribute("message1", message1);
        }

        session.setAttribute("students", results);

        String url = "/role1/home.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}


