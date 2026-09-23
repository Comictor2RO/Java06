package ex00;

public class Calculator {
    private Logger logger;

    Calculator(Logger logger){
        this.logger = logger;
    }

    public double add(double a, double b){
        double res = a + b;
        logger.log("Operation: " + a + " + " + b + " = " + res);
        return res;
    }

    public double subtract(double a, double b){
        double res = a - b;
        logger.log("Operation: " + a + " - " + b + " = " + res);
        return res;
    }

    public double multiply(double a, double b){
        double res = a * b;
        logger.log("Operation: " + a + " * " + b + " = " + res);
        return res;
    }

    public double divide(double a, double b){
        if(b == 0){
            logger.log("Operation: Division by zero attempted: " + a + " / " + b);
            throw new ArithmeticException("Division by zero.");
        }
        double res = a / b;
        logger.log("Operation: " + a + " / " + b + " = " + res);
        return res;
    }
}
