package reservation;

public class bus {
	 private int busNo;
	private boolean ac;
	private int capacity; // we have to define get and set ,because variables are in private
	
	bus(int no,boolean ac , int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getCapacity() { //accessor method
		return capacity;
	}
	public void setCapacity(int cap) { //mutator
		capacity = cap;
	}
	
	public boolean getaAc() {
		return ac;
	}
	public void setAc(boolean val) {
		ac = val;
	}
	
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int no) {
		busNo = no;
	}
	public void displayBusInfo(){
		System.out.println("Bus No:"+busNo+"Ac :"+ac+"Total capacity :"+capacity);
	}
}
