package com.daycare.controller;

import com.daycare.ContactResults;
import com.daycare.Results;
import com.daycare.utility.PropertiesLoader;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Properties;

/**
 * The type Service manager.
 * @author John Danner
 */
public class ServiceManager implements PropertiesLoader {

    private String FILE_PATH = "/properties.properties";
    private final Logger logger = LogManager.getLogger(this.getClass());
    private String restEndpointSuffix = "";

    /**
     * Gets student list.
     *
     * @return the student list
     */
    protected String getStudentList()  {
        String response = "";
        response = getJson();
        return response;
    }

    /**
     * Gets contacts.
     *
     * @param studentID the student id
     * @return the contacts
     */
    protected String getContacts(int studentID)  {
        restEndpointSuffix = Integer.toString(studentID);
        String response = "";
        response = getJson();
        return response;
    }

    /**
     * Gets json.
     *
     * @return the json
     */
    protected String getJson()  {
        String response = "";
        try {
            Properties properties = loadProperties(FILE_PATH);
            Client client = ClientBuilder.newClient();
            String call = properties.getProperty("service.endpoint") + restEndpointSuffix;
            WebTarget target = client.target(call);
            response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        } catch (Exception exception) {
            logger.error("Exception for Properties: " + exception);
        }

        return response;
    }

    /**
     * Create contact results list.
     *
     * @param serviceResponse the service response
     * @return the list
     */
    protected List<ContactResults> createContactResults(String serviceResponse) {
        List<ContactResults> contacts = null;
        try  {
            ObjectMapper mapper = new ObjectMapper();
            contacts = mapper.readValue(serviceResponse, new TypeReference<List<ContactResults>>(){});
        } catch (Exception exception)  {
            logger.error("Exception for Object Creation: ", exception);
        }
        return contacts;
    }

    /**
     * Create student results list.
     *
     * @param serviceResponse the service response
     * @return the list
     */
    protected List<Results> createStudentResults(String serviceResponse) {
        List<Results> students = null;
        try  {
            ObjectMapper mapper = new ObjectMapper();
            students = mapper.readValue(serviceResponse, new TypeReference<List<Results>>(){});
            logger.info("Student List: " + serviceResponse);
        } catch (Exception exception)  {
            logger.error("Exception for Object Creation: ", exception);
        }
        return students;
    }
}
