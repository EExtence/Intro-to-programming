package transferingFundsChallengeExersice;

public class TransferTest {

	public static void main(String[] args) {
		Account account1 = new Account("Freaady Fazbear", 0, 1000.00);
		Account account2 = new Account("Bonneth", 1, 1000.50);
		
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println("TRANSFER >:D");
		
		account1.transfer(account2, 100.50);
		
		System.out.println(account1.toString());
		System.out.println(account2.toString());
	}

}
