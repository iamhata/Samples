package patterns.Proxy;

import java.util.Hashtable;

public class UIDescriptionManagerProxy implements UIDescriptionManager {
	private UIDescriptionManager source;
	private Hashtable<String,String> map;
	
	public UIDescriptionManagerProxy(UIDescriptionManager aSource){
		source = aSource;
		map = new Hashtable<>();
	}
	
	@Override
	public String getDescription(String aID)
			throws DescriptionNotFoundException {
		if(!isDescriptionCached(aID)){
			cacheDescription(aID,source.getDescription(aID));
		}
		return getCachedDescription(aID);
	}
	private boolean isDescriptionCached(String aID){
		if(null == map.get(aID))
			return false;
		else
			return true;
	}
	private String getCachedDescription(String aID){
		return map.get(aID);
	}
	private void cacheDescription(String aID,String aValue){
		map.put(aID, aValue);
	}

}
