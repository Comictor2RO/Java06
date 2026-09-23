package ex02;

public class ExtendingResponsibilityTest {
    public static void main(String[] args) {
        // 1. Notifier simplu
        Notifier basic = new Notifier();
        basic.send("Hello");

        System.out.println("---");

        // 2. VerboseNotifier (subclasare)
        VerboseNotifier verbose = new VerboseNotifier();
        verbose.send("Hello");

        System.out.println("---");

        // 3. Notifier + Decorator (compoziție)
        Notifier decorated = new Notifier();
        NotifierDecorator decorator = new NotifierDecorator(decorated);
        decorator.send("Hello");
    }
}
