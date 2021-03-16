package tickets;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Movie {

 
    private String name;

    private int seatNumber;

    private boolean takenSeat;

    private float price;

    public Set<Booking> bookings = new HashSet<>();

    /**
     * Default constructor
     */
    public Movie() {
    }
    
    /**
     * @return
     */
    public String getName() {
       return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * @param seatNumber 
     * @return
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

	public boolean isTakenSeat() {
		return takenSeat;
	}

	public void setTakenSeat(boolean takenSeat) {
		this.takenSeat = takenSeat;
	}

    /**
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(float price) {
        this.price = price;
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