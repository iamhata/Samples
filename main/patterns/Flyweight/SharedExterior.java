package patterns.Flyweight;

import java.awt.Color;

import javax.swing.text.Style;

public class SharedExterior implements Exterior {

	public String _source = null;
	public ThreeDModel _model = null;
	
	public SharedExterior(String aFileName){
		
	}
	
	@Override
	public void draw(Color aColor, Style aStyle) {
		// TODO Auto-generated method stub

	}

}
