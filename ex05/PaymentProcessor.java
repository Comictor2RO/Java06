package ex05;

public class PaymentProcessor {
    private Logger logger;

    public PaymentProcessor(Logger logger){
        this.logger = logger;
    }

    public void processPayment(PaymentMethod method, double amount){
        logger.log("Attempting payment of: " + amount);
        boolean success = method.pay(amount);
        if(success){
            logger.log("Payment of " + amount + " succeeded.");
        }
        else{
            logger.log("Payment of " + amount + " failed.");
        }
    }
}
