package ex05;

public class Wallet {
    private double balance;

    public Wallet(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean hasFunds(double amount){
        return amount > 0 && balance >= amount;
    }

    public void Deduct(double amount){
        if(amount <= 0)
            return;
        balance -= amount;
    }
}
