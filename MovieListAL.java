import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private static ArrayList<Movie> pool = new ArrayList<Movie>();

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        for (int i = 0; i<movies.length; i++)
        {
            pool.add(movies[i]);
        }
    }

    public static ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public static ArrayList<Movie> getByStudio(String studio)
    {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        for (int i = 0; i<pool.size(); i++)
        {
            if (pool.get(i).getStudio().equals(studio))
            {
                movies.add(pool.get(i));
            }
        }
        return movies;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public static Movie getHighestrating(ArrayList<Movie> movies)
    {
        Movie best = movies.get(0);
        for (int i = 0; i<movies.size(); i++)
        {
            if (movies.get(i).getRating()>best.getRating())
            {
                best = movies.get(i);
            }
        }
        return best;
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        
        // Your code goes here
         return null;
        // return highestRated;
        
    }

}
