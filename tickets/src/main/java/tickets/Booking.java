package tickets;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Booking {

    private int number;

    public User user;

    public Set<Movie> movies = new HashSet<>();

    /**
     * Default constructor
     */
    public Booking() {
    }
    
    /**
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return
     */
    public Set<Movie> getMovies() {
        return movies;
    }

    /**
     * @param movie 
     * @return
     */
    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    /**
     * @param movie 
     * @return
     */
    public void addMovie(Movie movie) {
        this.movies.add(movie); 
    }

}