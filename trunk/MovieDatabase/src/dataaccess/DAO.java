/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Nyvang
 */
public class DAO {

    /**
     * Sends the sql statement to dbconn
     * @param sql
     * @return connection
     * @throws SQLException
     */
    protected static PreparedStatement getPreparedStatement(String sql) throws SQLException
    {
        Connection dbconn = DBHandler.getInstance().getConnection();
        return dbconn.prepareStatement(sql);
    }//end getPreparedStatement

    /**
     * Closes the database connection
     */
    protected static void close()
    {
        try
        {
            DBHandler.getInstance().getConnection().close();
        }
        catch (SQLException sqlex)
        {

        }
    }//end close method

}
