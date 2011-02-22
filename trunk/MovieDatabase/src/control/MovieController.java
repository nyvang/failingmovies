/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import dataaccess.MovieDAO;
import java.util.ArrayList;
import model.Movie;

/**
 *
 * @author Nyvang
 */
public class MovieController {

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
    public static boolean createMovie(String navn, int aarstal, String instruktion, String skuespiller, String skuespiller2, String genre)
    {
        return MovieDAO.getInstance().createMovie(navn, aarstal, instruktion, skuespiller, skuespiller2, genre);
    }
 
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
        return MovieDAO.getInstance().findMovies(id, navn, aarstal, instruktion, skuespiller, skuespiller2, genre);
    }

    /**
     * Find all movies stored in the database and returns them to the GUI
     * @return ArrayList<Movie> with results
     */
    public ArrayList<Movie> findAllMovies()
    {
        return MovieDAO.getInstance().findAllMovies();
    }
}
