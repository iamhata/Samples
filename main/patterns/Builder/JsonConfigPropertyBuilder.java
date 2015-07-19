package patterns.Builder;

public class JsonConfigPropertyBuilder implements ConfigPropertyBuilder {
	String platform = null;
	int timeout = -1;
	String location = null;
	
	@Override
	public void platform(String aValue) {
		platform = aValue;

	}

	@Override
	public void timeout(int aValue) {
		timeout = aValue;

	}

	@Override
	public void location(String aPath) {
		location = aPath;

	}

	@Override
	public String build() throws ConfigurationError {
		if(null == location){
			throw new ConfigurationError("The LOCATION property must be set!");
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		if(null != platform){
			sb.append(getJsonElementString("PLATFORM",platform)).append(",");
		}
		sb.append(getJsonElementString("TIMEOUT",timeout));
		sb.append(",").append(getJsonElementString("LOCATION",location));
		sb.append("}");
		return sb.toString();
	
	}
	private String getJsonElementString(String aKey,String aValue){
		return "\""+ aKey +"\":"+"\""+aValue+"\"";
	}
	private String getJsonElementString(String aKey,int aValue){
		return "\""+aKey+"\":" +aValue;
	}

}
