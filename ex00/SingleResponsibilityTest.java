package ex00;

public class SingleResponsibilityTest {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Calculator calculator = new Calculator(logger);

        calculator.add(5, 3);
        calculator.subtract(10, 4);
        calculator.multiply(2, 6);
        calculator.divide(20, 4);

        // Division by zero example
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            logger.log("Error: " + e.getMessage());
        }
    }
}
