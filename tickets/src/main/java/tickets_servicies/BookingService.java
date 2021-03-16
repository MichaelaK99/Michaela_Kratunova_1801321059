package tickets_servicies;

import java.util.List;
import java.util.ArrayList;

import tickets.User;

public class BookingService {

	public static String booking(String Fname, String Lname, int seatNumber, String movie) {
		
		if(Fname== null && Lname == null && seatNumber == 0 && movie == null) {
			return "Enter your name, seat number and movie";
		}
		
		
		if(Fname == null && Lname == null) {
			return "Enter your name";
		}
		
		if(seatNumber == 0) {
			return"Enter seat number";
		}
		
		if(movie == null) {
			return "Enter movie";
		}
		
	
		
		List<User> users = getUsers();
		final boolean isUserMatch = users.stream().anyMatch(user->user.getFname().equals(Fname)&&
																user.getLname().equals(Lname));
														
		return isUserMatch ? "OK" : "Invalid data";
		
	}

	private static List<User> getUsers(){
		User user = new User();
		user.setFname("Petar");
		user.setLname("Georgiev");
		final List<User> result = new ArrayList<>();
		result.add(user);
		return result;
	}
}
