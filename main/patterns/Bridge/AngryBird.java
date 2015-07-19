package patterns.Bridge;

import java.io.File;

public interface AngryBird {
	void startGame();
	void stopGmae();
	void playSound(File aFile);
	void fire();
	
}
