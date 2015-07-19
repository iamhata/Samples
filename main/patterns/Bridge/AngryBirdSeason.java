package patterns.Bridge;

import java.awt.Image;
import java.io.File;

public class AngryBirdSeason implements AngryBird {
	AngryBirdImplementor impl = null;
	GameMap map = null;
	
	
	public AngryBirdSeason(AngryBirdImplementor aImpl, GameMap aMap){
		impl = aImpl;
		map = aMap;
	}
	
	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Start the season version of AngryBird.");
		for(Image image :map.getImages()){
			impl.draw(image);
		}
	}

	@Override
	public void stopGmae() {
		// TODO Auto-generated method stub
		System.out.println("Stop the seaon version of AngryBird.");
		impl.stopSound();
	}

	@Override
	public void playSound(File aFile) {
		// TODO Auto-generated method stub
		impl.initSoundDevice();
		impl.playSound(aFile);
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub

	}

}
