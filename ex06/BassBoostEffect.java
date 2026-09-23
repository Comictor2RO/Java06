package ex06;

public class BassBoostEffect implements AudioEffect{
    @Override 
    public void apply(String song){
        System.out.println("[ Bass Boost Effect ]" + song);
    }
}
