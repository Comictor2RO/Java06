package ex02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VerboseNotifier extends Notifier{
    @Override
    public void send(String msg){
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        super.send("[ " + timestamp + " ] Vebose Sending notification:\n" + msg);
    }    
}
