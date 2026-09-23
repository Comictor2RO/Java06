package ex01;

public class OpenClosedTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Aria cercului: " + circle.getArea());
        System.out.println("Aria dreptunghiului: " + rectangle.getArea());
    }
}
