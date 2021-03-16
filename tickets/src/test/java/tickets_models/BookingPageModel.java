package tickets_models;

import tickets_servicies.BookingService;

public class BookingPageModel {

	
	private String Fname;
	private String Lname;
	private int seatNumber;
	private String movie;
	private String message;

	public void navigatetoBookingScreen() {
		
		
System.out.println("Navigate to Booking Screen");


	}
public void setNames(String Fname, String Lname) {
this.Fname = Fname;
this.Lname = Lname;
	}

	public void setSeatNumber(int seatNumber) {
this.seatNumber= seatNumber;		
	}

	public void setMovie(String movie) {
this.movie= movie;		
	}

	public void click_on_booking_button() {
message = BookingService.booking(Fname, Lname, seatNumber, movie);		
	}

	public String getBookingMessage() {
		
		return message ;
	}

	
}
