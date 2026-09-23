package ex06;

public class MusicPlayer {
    protected AudioEffect audioEffect;

    MusicPlayer(){
        this.audioEffect = null;
    }

    MusicPlayer(AudioEffect audioEffect){
        if(audioEffect == null)
            throw new IllegalArgumentException("Audio Effect cannot be null.");
        this.audioEffect = audioEffect;
    }

    public void setAudioEffect(AudioEffect audioEffect){
        if(audioEffect == null)
            throw new IllegalArgumentException("Audio Effect cannot be null.");
        this.audioEffect = audioEffect;
    }

    public void play(String song){
        if(audioEffect != null){
            audioEffect.apply(song);
        }
        else
            System.out.println(song);
    }
}
