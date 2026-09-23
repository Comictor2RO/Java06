package ex08;

public class CheckingAccount extends BankAccount{
    private double overDraftLimit;

    CheckingAccount(int accountNumber, double balance, double overDraftLimit, TransactionLogger logger){
        super(accountNumber, balance, logger);

        if(overDraftLimit <= 0)
            throw new IllegalArgumentException("Over Draft Limit cannot be less or equal to 0");

        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(balance - amount >= -overDraftLimit && amount > 0){
            balance -= amount;
            logger.log("A widthdrawal of " + amount + "$ has been made. Balance now stands at " + balance + "$");
        }
        else
            logger.log("Withdrawal failed due to " + (balance - amount) + " < " + overDraftLimit + " or " + amount + " <= 0");
    }
}
