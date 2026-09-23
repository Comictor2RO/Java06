package ex05;

public class CreditCardPayment implements PaymentMethod{
    private Wallet wallet;

    public CreditCardPayment(Wallet wallet){
        this.wallet = wallet;
    }

    @Override 
    public boolean pay(double amount){
        if(wallet.hasFunds(amount))
        {
            wallet.Deduct(amount);
            return true;
        }
        return false;
    }
}
