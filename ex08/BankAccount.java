package ex08;

public class BankAccount {
    protected int accountNumber;
    protected double balance;
    protected TransactionLogger logger;

    public BankAccount(int accountNumber, double balance, TransactionLogger logger){
        if(accountNumber <= 0 || balance < 0)
            throw new IllegalArgumentException("Account Number cannot be <= 0./Balance cannot be < 0.");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.logger = logger;
    }

    public void withdraw(double amount){
        if(balance >= amount && amount > 0){
            balance -= amount;
            logger.log("A widthdrawal of " + amount + "$ has been made. Balance now stands at " + balance + "$");
        }
        else
            logger.log("Withdrawal has failed.");
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            logger.log("A deposit of " + amount + "$ has been made. Balance now stands at " + balance + "$");
        }
        else
            logger.log("Deposit has failed.");
    }
}
