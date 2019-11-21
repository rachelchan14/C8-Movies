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
    private static ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        pool = new ArrayList<Movie>();
        for (Movie m: movies)
        {
            pool.add(m);
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
        for (Movie m: pool)
        {
            if (m.getStudio().equals(studio))
            {
                movies.add(m);
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
        for (Movie m: movies)
        {
            if (m.getRating()>best.getRating())
            {
                best = m;
            }
        }
        return best;
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public static ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        Movie dis = getHighestrating(getByStudio("Disney"));
        Movie ghi = getHighestrating(getByStudio("Ghibli"));
        Movie indy = getHighestrating(getByStudio("Indy"));
        highestRated.add(dis);
        highestRated.add(ghi);
        highestRated.add(indy);
        // Your code goes here
        return highestRated;
        // return highestRated;
        
    }

}
