package patterns.Bridge;

import java.awt.Image;
import java.io.File;

public class IceCreamSandwichImpl implements AngryBirdImplementor {

	@Override
	public void draw(Image aImage) {
		// TODO Auto-generated method stub
		System.out.println("Use IceCreamSandwichImpl to draw images.");

	}

	@Override
	public void draw2D(Image aImage) {
		// TODO Auto-generated method stub
		System.out.println("User IceCreamSandwichImpl to draw 2D images.");
	}

	@Override
	public void initSoundDevice() {
		// TODO Auto-generated method stub
		System.out.println("Use IceCreamSandwichImpl to initial sound devices.");
	}

	@Override
	public void playSound(File aFile) {
		// TODO Auto-generated method stub
		System.out.println("Use IceCreamSandwichImpl to play sounds.");
	}

	@Override
	public void stopSound() {
		// TODO Auto-generated method stub
		System.out.println("Use IceCreamSandwichImpl to stop palying sounds.");
	}

}
