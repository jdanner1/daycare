package com.daycare.controller;

import com.daycare.ContactResults;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Takes student selection and triggers service call for contact details, making them available to the page it send the user to for display.
 *
 *@author    John Danner
 */
@WebServlet(
        name = "HomeAction",
        urlPatterns = { "/HomeAction" }
)

public class HomeActionServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

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

        List<ContactResults> contactResults = null;
        String studentIdString = request.getParameter("student");
        int studentID = Integer.parseInt(studentIdString);

        ServiceManager serviceManager = new ServiceManager();
        HttpSession session = request.getSession();
        String serviceResponse = serviceManager.getContacts(studentID);
        if (serviceResponse == null) {
            String message2 = "There was an error retrieving the contacts for the selected student";
            session.setAttribute("message2", message2);
        }

        contactResults = serviceManager.createContactResults(serviceResponse);


        session.setAttribute("contacts", contactResults);

        String url = "Results";
        response.sendRedirect(url);
    }
}

