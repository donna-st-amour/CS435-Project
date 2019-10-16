
public class Account {
	String accountName;
	int accountNumber;
	Card paymentMethod;
	float balance;
	boolean depositSuccess = false;
	boolean withdrawSuccess = false;
	float amount;
	
	private float getBalance() {
		return balance;
	}//end getBalance method
	
	private boolean deposit(float amount) {
		balance = balance + amount;
		return depositSuccess;
	}//end deposit method
	
	private boolean withdraw(float amount) {
		if(balance > amount) {
			balance = balance - amount;
			withdrawSuccess = true;
			return withdrawSuccess;
		}//end if
		else {
			return withdrawSuccess;
		}//end else
	}//end withdraw method
}//end Account class
