package ex06;

public class CompositionSubclassingTest {
	public static void main(String[] args) {
		MusicPlayer player = new MusicPlayer();
		player.play("Song without effect");

		player.setAudioEffect(new EchoEffect());
		player.play("Song with echo");

		player.setAudioEffect(new BassBoostEffect());
		player.play("Song with bass boost");

		MusicPlayer bassBoostPlayer = new BassBoostMusicPlayer();
		bassBoostPlayer.play("Song from bass boost player");
        bassBoostPlayer.setAudioEffect(new EchoEffect()); //se aplica tot BassBoostEffect deoarece in 
                                                          //BassBoostPlayer se foloseste o variabila locala effect
                                                          //ignorand audioEffect modificat de setAudioEffect
        bassBoostPlayer.play("Song from bass boost player with echo effect");
	}
}
