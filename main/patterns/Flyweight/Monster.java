package patterns.Flyweight;

import java.awt.Color;

import javax.swing.text.Style;

public class Monster {
	private int _hp = 100;
	private int _power = 50;
	private String _name;
	private Exterior _exterior = null;
	
	private Color _color = null;
	private Style _style = null;
	
	public Monster(String aName,int _hp,int _power,String aFileName){
		this._name = aName;
		this._hp = _hp;
		this._power = _power;
		
		this._exterior  = ExteriorFactory.getInstance().getFlyweight(aFileName);
	}
	
}
