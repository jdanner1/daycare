package com.daycare.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class TestUserGenerator {
    private final Logger logger = LogManager.getLogger(this.getClass());

    public void initializeUser() {
        Database database = Database.getInstance();
        Connection connection = null;
        String sql = null;
        int rowsAdded = 0;

        try  {
            database.connect();
            connection = database.getConnection();
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 0;");
            logger.info("SQL_Result_1: " + result);
            result = statement.executeUpdate("TRUNCATE user;");
            logger.info("SQL_Result_2: " + result);
            result = statement.executeUpdate("TRUNCATE role;");
            logger.info("SQL_Result_3: " + result);
            result = statement.executeUpdate("SET FOREIGN_KEY_CHECKS = 1;");
            logger.info("SQL_Result_4: " + result);

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user "
                    + "(user_name, password) "
                    + "VALUES (?, ?)");



            preparedStatement.setString(1, "employee1");
            preparedStatement.setString(2, "daycare");
            rowsAdded = preparedStatement.executeUpdate();
            logger.info("User Rows Added: " + rowsAdded);


            PreparedStatement preparedStatement3 = connection.prepareStatement("INSERT INTO role "
                    + "(role_name, user_name, userId) "
                    + "VALUES (?, ?, ?)");


            preparedStatement3.setString(1, "role1");
            preparedStatement3.setString(2, "employee1");
            preparedStatement3.setInt(3, 1);
            rowsAdded = preparedStatement3.executeUpdate();
            logger.info("Role Rows Added: " + rowsAdded);

            PreparedStatement preparedStatement4 = connection.prepareStatement("INSERT INTO user "
                    + "(user_name, password) "
                    + "VALUES (?, ?)");

            preparedStatement4.setString(1, "employee4");
            preparedStatement4.setString(2, "daycare");
            rowsAdded = preparedStatement4.executeUpdate();
            logger.info("User Rows Added: " + rowsAdded);



            database.disconnect();
        } catch (SQLException sqlException) {
            logger.error("SQL_Exceptioon: " , sqlException);
        } catch (Exception exception) {
            logger.error("Exceptioon: " , exception);
        }

    }
}

