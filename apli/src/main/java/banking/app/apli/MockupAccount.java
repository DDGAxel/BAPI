package banking.app.apli;

import java.io.IOException;

public class MockupAccount {
	private int balance;
	private String iD;
	private String password;
	private String name;

	public Boolean updateAccountBalance(int amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public String getiD() {
		return iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void writeAccountLog(String s) {
		try {
			Log.write(s);
		} catch (IOException e) {
			System.out.println("Incorrect logging");
			e.printStackTrace();
		}
	}
}
