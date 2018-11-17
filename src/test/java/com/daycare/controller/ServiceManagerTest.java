package com.daycare.controller;

import com.daycare.ContactResults;
import com.daycare.Results;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceManagerTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    void getStudentList() {
        ServiceManager serviceManager = new ServiceManager();
        String response = serviceManager.getStudentList();
        assertEquals("[{\"studentID\":1,\"firstName\":\"Betsy\",\"lastName\":\"Brown\",\"churchAffiliation\":\"St Johns Watertown\",\"dob\":\"2010-10-10\",\"primaryAddress\":\"N7888 Hwy Q\",\"city\":\"Creek\",\"state\":\"MI\",\"zip\":\"53569\",\"email\":\"bb@gmail.com\",\"baptized\":\"y\",\"gender\":\"f\"},{\"studentID\":2,\"firstName\":\"Stephanie\",\"lastName\":\"Brock\",\"churchAffiliation\":\"St Johns Madison\",\"dob\":\"2010-01-10\",\"primaryAddress\":\"235 N Stock Street\",\"city\":\"Lake Mills\",\"state\":\"WI\",\"zip\":\"53599\",\"email\":\"sb@gmail.com\",\"baptized\":\"y\",\"gender\":\"f\"},{\"studentID\":3,\"firstName\":\"Cody\",\"lastName\":\"Stern\",\"churchAffiliation\":\"Lake Mills Public\",\"dob\":\"2007-01-01\",\"primaryAddress\":\"2010 E Lake Street\",\"city\":\"Jefferson\",\"state\":\"WI\",\"zip\":\"53549\",\"email\":\"cs@gmail.com\",\"baptized\":\"y\",\"gender\":\"m\"},{\"studentID\":4,\"firstName\":\"Dan\",\"lastName\":\"Collier\",\"churchAffiliation\":\"St Johns Madison\",\"dob\":\"2012-12-10\",\"primaryAddress\":\"102 North Street\",\"city\":\"Creek\",\"state\":\"WI\",\"zip\":\"53549\",\"email\":\"dc@gmail.com\",\"baptized\":\"y\",\"gender\":\"m\"},{\"studentID\":5,\"firstName\":\"Kelly\",\"lastName\":\"Brunner\",\"churchAffiliation\":\"St Johns Fort Atkinson\",\"dob\":\"2000-01-10\",\"primaryAddress\":\"67 E Main Street\",\"city\":\"Lake Mills\",\"state\":\"WI\",\"zip\":\"53559\",\"email\":\"kb@gmail.com\",\"baptized\":\"y\",\"gender\":\"f\"}]", response);
    }

    @Test
    void getContacts() {
        int studentId = 1;
        ServiceManager serviceManager = new ServiceManager();
        String results = serviceManager.getContacts(studentId);
        assertEquals("[{\"contactID\":1,\"firstName\":\"Rebecca\",\"lastName\":\"Garth\",\"relationshipToStudent\":\"mother\",\"cellPhone\":\"9209886767\",\"workPhone\":\"9209446767\",\"baptized\":\"y\",\"employer\":\"Chucky Cheese\",\"hoursWorked\":\"50\",\"address\":\"N7888 Hwy Q\",\"city\":\"Creek\",\"state\":\"MI\",\"zip\":\"53569\",\"email\":\"becky@gmail\",\"dob\":\"1987-10-10\",\"students\":[{\"studentID\":1,\"firstName\":\"Betsy\",\"lastName\":\"Brown\",\"churchAffiliation\":\"St Johns Watertown\",\"dob\":\"2010-10-10\",\"primaryAddress\":\"N7888 Hwy Q\",\"city\":\"Creek\",\"state\":\"MI\",\"zip\":\"53569\",\"email\":\"bb@gmail.com\",\"baptized\":\"y\",\"gender\":\"f\"}]}]", results);
    }

    @Test
    void createContactResults() {
        int studentId = 1;
        List<ContactResults> contacts = null;
        ServiceManager serviceManager = new ServiceManager();
        String results = serviceManager.getContacts(studentId);
        contacts = serviceManager.createContactResults(results);
        for (ContactResults currentContact : contacts) {
            assertEquals(currentContact.getAddress(), "N7888 Hwy Q");
        }
    }

    @Test
    void createStudentResults() {
        String studentList = "";
        List<Results> students = null;
        ServiceManager serviceManager = new ServiceManager();
        studentList = serviceManager.getStudentList();
        students = serviceManager.createStudentResults(studentList);
        for (Results currentStudent : students) {
            assertNotNull(currentStudent.getStudentID());
            logger.info("StudentId: " + currentStudent.getStudentID());
        }
    }
}