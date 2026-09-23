package ex02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotifierDecorator {
    private Notifier notifier;

    NotifierDecorator(Notifier n){
        this.notifier = n;
    }

    public void send(String msg){
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        System.out.println("[ " + timestamp + " ] Decorator Sending notification: ");
        notifier.send(msg);
    }
}
