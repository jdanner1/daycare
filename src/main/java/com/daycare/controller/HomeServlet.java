package com.daycare.controller;

import com.daycare.entity.User;
import com.daycare.utility.PropertiesLoader;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import javax.servlet.RequestDispatcher;
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
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Properties;


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
public class HomeServlet extends HttpServlet implements PropertiesLoader {

    private String FILE_PATH = "/properties.properties";
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Forwards request and response objects to the JSP page.
     *
     * @param response - the HttpServletResponse object
     * @param request - the HttpServletRequest object
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String serviceResponse = getStudentList();
        /*createObjects(serviceResponse); */

        HttpSession session = request.getSession();
        session.setAttribute("students", serviceResponse);

        String url = "/role1/home.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

   private void createObjects(String serviceResponse) {
        ObjectMapper mapper = new ObjectMapper();
        /*  Fill in once we have the service - will use the pojogenerator to create in the entity package when we have json, may adjust this method to return resultsItem or even the student List.
        Response results = mapper.readValue(response, Response.class);
        ResultsItem result = results.getResults().get(0);
        */

    }

    private String getStudentList()  {
        String studentListOperation = "daycareSearch";
        String response = "";
        try {
            Properties properties = loadProperties(FILE_PATH);
            Client client = ClientBuilder.newClient();
            String call = properties.getProperty("service.endpoint") + studentListOperation;
            WebTarget target = client.target(call);
            String serviceResponse = target.request(MediaType.TEXT_PLAIN).get(String.class);  //"text/plain"  APPLICATION_JSON
            response =  serviceResponse;
        } catch (Exception exception) {
            logger.error("Exception for Properties: " + exception);
        }
        return response;
    }
}


