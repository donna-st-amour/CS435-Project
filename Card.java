public class Card {
	String name;
	int cardNumber;
	String expirationDate;
	int securityCode;
	boolean update = false;
	
	public Card(String name, int cardNumber, String expirationDate, int securityCode){
		this.name = name;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
	}//end card constructor
	
	@SuppressWarnings("unused")
	private boolean updateInfo(String name, int cardNumber, String expirationDate, int securityCode) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		update = true;
		return update;
	}//end updateInfo method
	
}//end Card class