package ex05;

public class SROCTest {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(100.0);
        Logger logger = new Logger();
        PaymentProcessor processor = new PaymentProcessor(logger);

        PaymentMethod card = new CreditCardPayment(wallet);
        PaymentMethod paypal = new PayPalPayment(wallet);

        processor.processPayment(card, 50.0);   // ar trebui să reușească
        processor.processPayment(paypal, 60.0);  // ar trebui să eșueze (nu mai sunt fonduri)

        double balanceBeforeNegativePayment = wallet.getBalance();
        if (card.pay(-10.0) || wallet.getBalance() != balanceBeforeNegativePayment) {
            throw new AssertionError("O plata negativa nu trebuie acceptata");
        }

        if (paypal.pay(-20.0) || wallet.getBalance() != balanceBeforeNegativePayment) {
            throw new AssertionError("O plata negativa PayPal nu trebuie acceptata");
        }

        System.out.println("Testele pentru plati negative au trecut.");
    }
}
