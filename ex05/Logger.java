package ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public void log(String msg){
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        System.out.println("[ " + timestamp + " ] " + msg);
    }
}
