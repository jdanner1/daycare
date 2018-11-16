package com.daycare.controller;

import com.daycare.ContactResults;
import com.daycare.Results;
import com.daycare.entity.Role;
import com.daycare.entity.User;
import com.daycare.persistence.GenericDao;
import com.daycare.utility.PropertiesLoader;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 *
 *
 *@author    John Danner
 */
@WebServlet(
        name = "HomeAction",
        urlPatterns = { "/HomeAction" }
)

public class HomeActionServlet extends HttpServlet implements PropertiesLoader {

    private String FILE_PATH = "/properties.properties";
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
        String serviceResponse = getContacts(studentID);
        contactResults = createObjects(serviceResponse);


        HttpSession session = request.getSession();
        session.setAttribute("contacts", contactResults);

        String url = "Results";
        response.sendRedirect(url);

    }

    private String getContacts(int studentID)  {
        String studentListOperation = "students/" + studentID;
        String response = "";
        try {
            Properties properties = loadProperties(FILE_PATH);
            Client client = ClientBuilder.newClient();
            String call = properties.getProperty("service.endpoint") + studentListOperation;
            WebTarget target = client.target(call);
            String serviceResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
            response =  serviceResponse;
        } catch (Exception exception) {
            logger.error("Exception for Properties: " + exception);
        }
        return response;
    }

    private List<ContactResults> createObjects(String serviceResponse) {
        ContactResults results = null;
        List<ContactResults> contacts = null;
        try  {
            ObjectMapper mapper = new ObjectMapper();
            contacts = mapper.readValue(serviceResponse, new TypeReference<List<ContactResults>>(){});
        } catch (Exception exception)  {
            logger.error("Exception for Object Creation: ", exception);
        }
        return contacts;
    }
}

