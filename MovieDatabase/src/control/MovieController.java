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

    public boolean createMovie(String navn, int aarstal, String instruktion, String skuespiller, String skuespiller2, String genre)
    {
        return MovieDAO.getInstance().createMovie(navn, aarstal, instruktion, skuespiller, skuespiller2, genre);
    }
 
    public ArrayList<Movie> findMovies(int id, String navn, int aarstal, String instruktion, String skuespiller, String skuespiller2, String genre)
    {
        return MovieDAO.getInstance().findMovies(id, navn, aarstal, instruktion, skuespiller, skuespiller2, genre);
    }
}