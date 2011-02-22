/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Movie;

/**
 *
 * @author Nyvang
 */
public class MovieDAO extends DAO{

    private static MovieDAO instance;

    private MovieDAO() {
    }

    public static MovieDAO getInstance()
    {
        if(instance == null)
        {
            instance = new MovieDAO();
        }
        return instance;
    }//end singleton

    /**
     * 
     * @param navn
     * @param aarstal
     * @param instruktion
     * @param skuespiller
     * @param skuespiller2
     * @param genre
     * @return 
     */
    public boolean createMovie(String navn, int aarstal, String instruktion, String skuespiller, String skuespiller2, String genre)
    {
       try
       {
           int id = getHighestIdentifier() + 1;
           PreparedStatement pstmt = getPreparedStatement("INSERT INTO movies "
                   + "(id, moviename, prodyear, instructor, actor, actor2, genre) VALUES(?,?,?,?,?,?,?)");
           pstmt.setInt(1, id);
           pstmt.setString(2, navn);
           pstmt.setInt(3, aarstal);
           pstmt.setString(4, instruktion);
           pstmt.setString(5, skuespiller);
           pstmt.setString(6, skuespiller2);
           pstmt.setString(7, genre);
           pstmt.execute();
       }
       catch (SQLException sqlex)
       {
           System.err.println("Error in createMovie method: " + sqlex);
           return false;
       }

       finally
       {
           close();
       }
        return true;
    }//end createUser method

    /**
     * 
     * @param id
     * @param navn
     * @param aarstal
     * @param instruktion
     * @param skuespiller
     * @param skuespiller2
     * @param genre
     * @return 
     */
    public ArrayList<Movie> findMovies(int id, String navn, int aarstal, String instruktion, String skuespiller, String skuespiller2, String genre)
    {
        ArrayList<Movie> resultFound = new ArrayList<Movie>();
        try
        {
            PreparedStatement pstmt = getPreparedStatement("SELECT * FROM movie WHERE "
                    + "LOWER(id) LIKE LOWER(?) "
                    + "OR LOWER(navn) LIKE LOWER(?) "
                    + "OR LOWER(aarstal) LIKE LOWER(?) "
                    + "OR LOWER(instruktion) LIKE LOWER(?) "
                    + "OR LOWER(skuespiller) LIKE LOWER(?) "
                    + "OR LOWER(skuespiller2) LIKE LOWER(?) "
                    + "OR LOWER(genre) LIKE LOWER(?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, navn);
            pstmt.setInt(3, aarstal);
            pstmt.setString(4, instruktion);
            pstmt.setString(5, skuespiller);
            pstmt.setString(6, skuespiller2);
            pstmt.setString(7, genre);
            ResultSet rs = null;
            rs = pstmt.executeQuery();

            while(rs.next())
            {
                int idInt = rs.getInt("id");
                String navnString = rs.getString("navn");
                int aarstalInt = rs.getInt("aarstal");
                String instruktionString = rs.getString("instruktion");
                String skuespillerString = rs.getString("skuespiller");
                String skuespiller2String = rs.getString("skuespiller2");
                String genreString = rs.getString("genre");
                Movie m = new Movie(idInt, navnString, aarstalInt, instruktionString, skuespillerString, skuespiller2String, genreString);
                resultFound.add(m);
            }//end while
          
        }//end try
        catch (SQLException sqlex)
        {
            System.err.println("Error in findMovie(): " + sqlex);
        }//end catch
        finally
        {
            close();
        }//end finally
        return resultFound;
    }//end method findMovies
      
    /**
     * As some DB´s do not autoincrement identifier, this method returns the highest identifier.
     * @return id the highest used number in the database
     */
    public int getHighestIdentifier()
    {
        int id;
        try
        {
            PreparedStatement pstmt = getPreparedStatement("SELECT MAX(identifier) FROM movies");
            ResultSet rsr = null;
            rsr = pstmt.executeQuery();
            rsr.next();
            id = rsr.getInt("id");
        }//end try
        catch (SQLException sqlex)
        {
            System.err.println("Error while getting highest Identifier from DB");
            return -1;
        }//end catch
        finally
        {
            close();
        }//end finally
        return id;
    }//end getHighestIdentifier method
}//end UserDAO class
