package tickets;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class User {


    private String fname;

    private String lname;

    private Set<Booking> bookings = new HashSet<>();

    /**
     * Default constructor
     */
    public User() {
    }
    
    /**
     * @return
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname 
     * @return
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname 
     * @return
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return
     */
    public Set<Booking> getBookings() {
        return bookings;
    }

    /**
     * @param booking 
     * @return
     */
    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    /**
     * @param booking 
     * @return
     */
    public void addBooking(Booking booking) {
      this.bookings.add(booking);
    }

}