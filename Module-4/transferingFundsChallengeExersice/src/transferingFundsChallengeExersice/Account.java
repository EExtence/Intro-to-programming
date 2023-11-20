package transferingFundsChallengeExersice;

import java.text.NumberFormat;

public class Account {
	private final double RATE = 0.035; // interest rate of 3.5%
	private long acctNumber;
	private double balance;
	private String name;

	// -----------------------------------------------------------------
	// Sets up the account by defining its owner, account number,
	// and initial balance.
	// -----------------------------------------------------------------
	public Account(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}

	// -----------------------------------------------------------------
	// Deposits the specified amount into the account. Returns the
	// new balance.
	// -----------------------------------------------------------------
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	// -----------------------------------------------------------------
	// Withdraws the specified amount from the account and applies
	// the fee. Returns the new balance.
	// -----------------------------------------------------------------
	public double withdraw(double amount, double fee) {
		balance = balance - amount - fee;

		return balance;
	}

	// -----------------------------------------------------------------
	// Adds interest to the account and returns the new balance.
	// -----------------------------------------------------------------
	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}

	// -----------------------------------------------------------------
	// Returns the current balance of the account.
	// -----------------------------------------------------------------
	public double getBalance() {
		return balance;
	}

	// -----------------------------------------------------------------
	// Returns a one-line description of the account as a string.
	// -----------------------------------------------------------------
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}

// ADD A PUBLIC METHOD CALLED transfer WHICH ACCEPTS 1 ACCOUNT OBJECT
// AND AN AMOUNT TO TRANSFER. THIS METHOD WILL WITHDRAWL MONEY FROM this
// ACCOUNT OBJECT AND DEPOSIT INTO THE PASSES ACCOUNT OBJECT
	public void transfer(Account accountName, double amountToTransfer) {
		this.withdraw(amountToTransfer, 0.05);
		accountName.deposit(amountToTransfer);
	}

// ADD A PUBLIC STATIC METHOD CALLED transfer WHICH ACCEPTS 2 ACCOUNT OBJECTS 
// AND AN AMOUNT TO TRANSFER. THIS METHOD WILL WITHDRAWL MONEY FROM ONE ACCOUNT 
// OBJECT AND DEPOSIT IT INTO THE OTHER ACCOUNT OBJECT
	public static void transfer(Account accountTransferFrom, Account accountTransferTo, double amountToTransfer) {
		accountTransferFrom.withdraw(amountToTransfer, 0.05);
		accountTransferTo.deposit(amountToTransfer);
	}
}
