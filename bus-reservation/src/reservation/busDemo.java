package reservation;
import java.util.Scanner;
import java.util.ArrayList;
public class busDemo {
	public static void main(String args[]) {
		
			ArrayList<bus> buses = new ArrayList<bus>();
			ArrayList<Booking> bookings = new ArrayList<Booking>();
			buses.add(new bus(1,true,2 ));
			buses.add(new bus(2,false,46));
			buses.add(new bus(3,true,47));
			int userOpt = 1;
			Scanner input = new Scanner(System.in);
			
			for(bus b:buses) {
				b.displayBusInfo();
			}
			
			while(userOpt==1) {
			System.out.println("Enter 1 to book and  2 to exit!");
			userOpt = input.nextInt();
			if(userOpt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)){
					bookings.add(booking);
					System.out.println("your booking is confirmed!");
				}
				else{
					System.out.println("Sorry, Bus is full, Try another bus or date.");
				}
				
			}
			}
	}
	
}
