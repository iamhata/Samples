package patterns.Prototype;

public class Exterior implements Cloneable{
	public String source = null;
	
	public Exterior (String aFileName){
		source = aFileName;
		
		try{
			Thread.sleep(20);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public Exterior clone(){
		Exterior newObject = null;
		try{
			newObject = (Exterior) super.clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
		memoryCopy(this, newObject);
		
		return newObject;
	}
	
	private void memoryCopy(Exterior aSrource, Exterior aDest){
		try{
			Thread.sleep(5);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
