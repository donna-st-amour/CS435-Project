
public class Spot {
	int spotNumber;
	boolean spotOpen = true;
	
	public Spot(int spotNumber, boolean spotOpen) {
		this.spotNumber = spotNumber;
		this.spotOpen = spotOpen;
	}//end constructor
	
	public boolean setOpen() {
		return true;
	}//end setOpen method
	
	public boolean spotReserved() {
		return true;
	}//end spotReserved method
	
}//end Spot class
