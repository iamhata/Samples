package patterns.Bridge;

import java.awt.Image;
import java.io.File;

public interface AngryBirdImplementor {
	public void draw(Image aImage);
	public void draw2D(Image aImage);
	public void initSoundDevice();
	public void playSound(File aFile);
	public void stopSound();

}
