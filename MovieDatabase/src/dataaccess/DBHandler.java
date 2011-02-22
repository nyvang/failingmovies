/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nyvang
 */
public class DBHandler {

    //Class variables
    private static DBHandler instance;
    private static Connection dbconn;
    //Instance variables
    private String addressToDriver;
    private String connectionString;
    private String dbUser;
    private String dbPassword;

    /**
     * Construsts an instance of DBHandler
     */
    private DBHandler() 
    {
         addressToDriver = "org.apache.derby.jdbc.ClientDriver";
        connectionString = "jdbc:derby://localhost:1527/movies";
//        addressToDriver = "com.mysql.jdbc.Driver";
//        connectionString = "jdbc:mysql://welovefailing.com:3306/Movies";
//        dbUser = "webuser";
//        dbPassword = "web";
    }

    /**
     * Singleton method for DBHandler
     * @return instance
     */
    public static DBHandler getInstance() {
        if (instance == null) {
            instance = new DBHandler();
        }
        return instance;
    }//end singleton pattern method

    /**
     * Sets the database with connection credentials
     */
    private void setDB() {
    }

    /**
     * Opens the connecton
     * @return dbconn the connection object
     */
    public Connection getConnection() {
        try {
            Class.forName(addressToDriver);
            dbconn = DriverManager.getConnection(connectionString, dbUser, dbPassword);
            return dbconn;
        }//end try
        catch (SQLException sqlex) {
            return null;
        }//end catch
        catch (ClassNotFoundException cnfe) {
            return null;
        }//end catch
    }//end method getConnection

    /**
     * Sets the autocommit
     * @param boolean state
     * @throws SQLException
     */
    private void autoCommit(boolean state) throws SQLException {
        dbconn.setAutoCommit(state);
    }//end method autoCommit
}
