package patterns.Bridge;

import java.awt.Image;
import java.io.File;

public class HoneycombImpl implements AngryBirdImplementor {

	@Override
	public void draw(Image aImage) {
		// TODO Auto-generated method stub
		System.out.println("Use HoneycombImpl to draw images.");

	}

	@Override
	public void draw2D(Image aImage) {
		// TODO Auto-generated method stub
		System.out.println("Use HoneycombImpl to draw 2D images.");
	}

	@Override
	public void initSoundDevice() {
		// TODO Auto-generated method stub
		System.out.println("Use HoneycombImple to initial sound devices.");
	}

	@Override
	public void playSound(File aFile) {
		// TODO Auto-generated method stub
		System.out.println("Use HoneycombImpl to paly sounds.");
	}

	@Override
	public void stopSound() {
		// TODO Auto-generated method stub
		System.out.println("Use HoneycombImpl to stop playing sounds.");
	}

}
