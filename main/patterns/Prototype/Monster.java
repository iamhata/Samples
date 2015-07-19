package patterns.Prototype;

public class Monster implements Cloneable{
	private int hp = 100;
	private int power = 50;
	Exterior ext = null;
	
	public Monster(int hp, int power ,String aFileName){
		this.hp = hp;
		this.power = power;
		this.ext = new Exterior(aFileName);
	}
	
	
	public Monster clone(){
		Monster  newObject = null;
		try{
			newObject = (Monster) super.clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
		
		newObject.hp = this.hp;
		newObject.power = this.power;
		newObject.ext = this.ext.clone();
		return newObject;
	}

}
