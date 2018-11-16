package com.daycare.controller;

import com.daycare.Results;
import com.daycare.entity.User;
import com.daycare.utility.PropertiesLoader;
import com.fasterxml.jackson.core.type.TypeReference;
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
import java.util.List;
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

        List<Results> results = null;

        String serviceResponse = getStudentList();
        results = createObjects(serviceResponse);

        HttpSession session = request.getSession();
        session.setAttribute("students", results);

        String url = "/role1/home.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

   private List<Results> createObjects(String serviceResponse) {
        Results results = null;
       List<Results> students = null;
        try  {
            ObjectMapper mapper = new ObjectMapper();
             students = mapper.readValue(serviceResponse, new TypeReference<List<Results>>(){});
        } catch (Exception exception)  {
            logger.error("Exception for Object Creation: ", exception);
        }
       return students;
    }

    private String getStudentList()  {
        String studentListOperation = "students";
        String response = "";
        try {
            Properties properties = loadProperties(FILE_PATH);
            Client client = ClientBuilder.newClient();
            String call = properties.getProperty("service.endpoint") + studentListOperation;
            WebTarget target = client.target(call);
            String serviceResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);  //"text/plain"  APPLICATION_JSON
            response =  serviceResponse;
        } catch (Exception exception) {
            logger.error("Exception for Properties: " + exception);
        }
        return response;
    }
}


