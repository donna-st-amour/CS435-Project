import java.util.Scanner;

public class Driver implements TicketSystem {
	Card card;
	String licensePlate;
	Account account = new Account();
	
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

	public int scanTicket() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the ticket number: ");
		int ticket = keyboard.nextInt();
		keyboard.close();
		//Must also open a spot here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		return ticket;
	}//end scanTicket method
	
	public void printTicket(){
		
	}//end printTicket method
	
	public void printReceipt(){
		
	}//end printReceipt method

}//end Driver class
