# Team Tacos Group Project

### Problem Statement

The daycare associated to the school being served in Kortney's individual project requires access to a portion of the school's data.  To avoid duplication of entry, storage, and maintenance the daycare desires a system that can call for information when needed, rather than store it.  The data will be private so access must be controlled.  At this time all users can have the same level of access but only authorized users may access data.  

The system must allow for selecting a student by name then provide the following for each parent/guardian:  First Name, Last Name, Address1, Address2, City, State, Zip, Email, Cell Phone, Work Phone, Relationship.

There must also be capability to maintain users.

 

### Project Technologies/Techniques

* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * User role: create trail, create trail report, edit data they have entered previously
  * All: anyone can view trail information (no login)
* Database
  * MySQL
  * Store users and roles
  * Store all data for the trails and reports
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* Web Services consumed using Java
  * School contact REST service
* CSS 
  * Bootstrap 
* Data Validation
  * Bootstrap Validator for front end
  * Explore Hibernate's validation
* Logging
  * Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Hosting
  * AWS
* Independent Research Topic/s
  * CI tools in AWS
  * Materialize
  * Google Maps API
  * Hibernate Validation
  * Hibernat Search
* Project Lombok to eliminate boilerplate code like getters/setters/equals
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage 
* IDE: IntelliJ IDEA


### Design

* [Screen Design](Project_Documentation/Individual_Project_Screens.pdf)
* [Application Flow](DesignDocuments/applicationFlow.md)
* [Database Design](DesignDocuments/databaseDiagram.png)

### [Project Plan](Project_Documentation/Individual_Project_Plan.docx)

### [Development Journal](Journal.md)
