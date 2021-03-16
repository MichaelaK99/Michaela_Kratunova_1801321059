package tickets;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tickets_models.BookingPageModel;

public class BookingSteps {
	
	BookingPageModel  bookingPageModel = new BookingPageModel();
	
	
	@Given("^User opens booking screen$")
	public void user_opens_booking_screen() throws Throwable {
		bookingPageModel.navigatetoBookingScreen();
	}

	@When("^Enters names \"([^\"]*)\"$")
	public void enters_names(String FnameLname) throws Throwable {
		String[] splitStr = FnameLname.split(" ");
		String Fname = splitStr[0];
		String Lname = splitStr[1];
		bookingPageModel.setNames(Fname, Lname);
		
	}

	@When("^Enters seat number (\\d+)$")
	public void enters_seat_number(int seatNumber) throws Throwable {
		bookingPageModel.setSeatNumber(seatNumber);
	}

	@When("^Enters movie \"([^\"]*)\"$")
	public void enters_movie(String movie) throws Throwable {
		bookingPageModel.setMovie(movie);
	}

	@When("^Clicks on booking button$")
	public void clicks_on_booking_button() throws Throwable {
		bookingPageModel.click_on_booking_button();
	}

	@Then("^Gets message \"([^\"]*)\"$")
	public void gets_message(String expectedMessage) throws Throwable {
	   assertEquals(expectedMessage, bookingPageModel.getBookingMessage());
	}

	





}
