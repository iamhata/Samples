package patterns.Flyweight;

import java.util.Hashtable;

public class ExteriorFactory {
	private Hashtable<String,Exterior> _pool = new Hashtable<>();
	private static ExteriorFactory _instance = new ExteriorFactory();
	
	public static ExteriorFactory getInstance(){
		return _instance;
	}
	
	public synchronized Exterior getFlyweight(String aFileName){
		
		if(null == aFileName )
			throw new RuntimeException("File name cannot be null.");
		
		if(null == _pool.get(aFileName)){
			_pool.put(aFileName, new SharedExterior(aFileName));
		}
		return _pool.get(aFileName);
	}

	public int getFlyweightSize(){
		return _pool.size();
	}
}
