package ex05;

public class PayPalPayment implements PaymentMethod{
    private Wallet wallet;

    public PayPalPayment(Wallet wallet){
        this.wallet = wallet;
    }

    @Override 
    public boolean pay(double amount){
        if(wallet.hasFunds(amount)){
            wallet.Deduct(amount);
            return true;
        }
        return false;
    }
}
