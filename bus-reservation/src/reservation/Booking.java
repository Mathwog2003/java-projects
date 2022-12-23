package reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.*;



public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of the passesnger ?");
		passengerName = input.next();
		System.out.println("Enter bus No :");
		busNo = input.nextInt();
		System.out.println("Enter date dd-mm-yy");
		String dateInput = input.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<bus> buses) {
		int capacity = 0;
		for(bus buss:buses) {
			if(buss.getBusNo()==busNo)
				capacity = buss.getCapacity();
		}
		int booked =0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
				
		}
		return booked<capacity?true:false;
	}
}
