package banking.app.apli;

public class Transaction {

	private int amount;
	private int IDLocation;
	private int LocationBalance;

	public void transfer() {
		updateBankAccount(amount);
		LocationBalance = getIDLocationBalance(IDLocation); // using connectors
		LocationBalance += amount;
		sendIDlocationBalance(IDLocation); // using the connectors

	}
}
