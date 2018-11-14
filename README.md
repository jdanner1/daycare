# Team Tacos Group Project

### Problem Statement

The daycare associated to the school being served in Kortney's individual project requires access to a portion of the school's data.  To avoid duplication of entry, storage, and maintenance the daycare desires a system that can call for information when needed, rather than store it.  The data will be private so access must be controlled.  At this time all users can have the same level of access but only authorized users may access data.  

The system must allow for selecting a student by name then provide the following for each parent/guardian:  First Name, Last Name, Address1, Address2, City, State, Zip, Email, Cell Phone, Work Phone, Relationship.

There must also be capability to maintain users.

 

### Project Technologies/Techniques

* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * Only authorized users from daycare can sign in
* Database
  * MySQL
  * Store contacts and students information
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* Web Services consumed using Java
  * School contact REST service
* CSS 
  * Bootstrap
* Logging
  * Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Hosting
  * AWS
* Independent Research Topic/s
  * Java Objects to JSON conversion
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage 
* IDE: IntelliJ IDEA


### [Project Plan](Documentation/projectPlan.docx)

### [Development Journal](Documentation/Journal.md)

### [Progress Log](Documentation/progressLog.md)


