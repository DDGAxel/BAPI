package banking.app.apli;

public class Transaction {

	private int LocationBalance;

	public void transfer(MockupAccount Acc, int amount, String iDLocation) {
		Acc.writeAccountLog("Accesing Balance for " + amount);
		if (Acc.updateAccountBalance(amount)) {
			Acc.writeAccountLog("Success");
			setLocationBalance(getIDLocationBalance(iDLocation)); // using the
																	// connectors
			setLocationBalance(getLocationBalance() + amount);
			if (sendIDlocationBalance(iDLocation)) {
				// using the connectors
				Acc.writeAccountLog("Transfered Money to " + iDLocation);
			}
		} else {
			System.out.println("Transfer rejected!Insuficient Funds!");
			Acc.writeAccountLog("Failed Transaction:Insuficient Funds!");
		}
	}

	private Boolean sendIDlocationBalance(String iDLocation) {
		System.out.println("Transfer completed");
		return true;

	}

	private int getIDLocationBalance(String iDLocation) {
		return 0;
	}

	public int getLocationBalance() {
		return LocationBalance;
	}

	public void setLocationBalance(int locationBalance) {
		LocationBalance = locationBalance;
	}

}
