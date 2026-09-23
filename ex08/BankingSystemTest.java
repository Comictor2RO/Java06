package ex08;

public class BankingSystemTest {
	public static void main(String[] args) {
		TransactionLogger logger = new TransactionLogger();

		BankAccount account = new BankAccount(1001, 500.0, logger);
		account.deposit(100.0);
		account.withdraw(200.0);
		account.withdraw(500.0);

		CheckingAccount checkingAccount = new CheckingAccount(1002, 100.0, 200.0, logger);
		checkingAccount.withdraw(250.0);
		checkingAccount.withdraw(100.0);

		SavingsAccount savingsAccount = new SavingsAccount(1003, 1000.0, 0.05, logger);
		savingsAccount.deposit(200.0);
		savingsAccount.applyInterest();

		System.out.println("Sold cont normal: " + account.balance + "$");
		System.out.println("Sold checking: " + checkingAccount.balance + "$");
		System.out.println("Sold savings: " + savingsAccount.balance + "$");
	}
}
