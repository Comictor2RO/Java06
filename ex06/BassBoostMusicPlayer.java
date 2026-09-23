package ex06;

public class BassBoostMusicPlayer extends MusicPlayer{
    BassBoostEffect effect = new BassBoostEffect();
    @Override 
    public void play(String song){
        effect.apply(song);
    }
}
