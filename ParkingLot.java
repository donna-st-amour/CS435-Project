import java.util.Scanner;

public class ParkingLot implements TicketSystem{
	LotSection[] lotArray;
	
	@Override
	public Card scanCard(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the driver's name: ");
		String name = keyboard.nextLine();
		System.out.println("Enter the card number: ");
		int cardNum = keyboard.nextInt();
		System.out.println("Enter the expiration date of the card: ");
		String expDate = keyboard.nextLine();
		System.out.println("Enter the security code on the back of the card: ");
		int secCode = keyboard.nextInt();
		keyboard.close();
		Card card = new Card(name, cardNum, expDate, secCode);
		//Must also assign a spot/ticket # here !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		return card;
	}//end scanCard method

	@Override
	public void printTicket() {
		// TODO Auto-generated method stub
		
	}//end printTicket method
	
	@Override
	public int scanTicket() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the ticket number: ");
		int ticket = keyboard.nextInt();
		keyboard.close();
		//Must also open a spot here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		return ticket;
	}//end scanTicket method


	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		
	}//end printReceipt method
	
	public boolean addSection() {
		return true;
	}//end addSection method
	
	public boolean removeSection() {
		return true;
	}//end removeSection method

	
	
}//end ParkingLot class
