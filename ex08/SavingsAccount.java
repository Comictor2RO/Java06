package ex08;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate, TransactionLogger logger){
        super(accountNumber, balance, logger);

        if(interestRate <= 0)
            throw new IllegalArgumentException("Interest Rate cannot be equal or less then 0");

        this.interestRate = interestRate;
    }

    public void applyInterest(){
        balance = balance + balance * interestRate;
        logger.log("We added an interest of " + (interestRate * 100) + "% into your accoung. Balance now stands at " + balance + "$");
    }
}
