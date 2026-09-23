package ex06;

public class EchoEffect implements AudioEffect{
    @Override 
    public void apply(String song){
        System.out.println("[ Echo Effect ]" + song);
    }
}
