package patterns.Builder;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PlainTextConfigPropertyBuilder implements ConfigPropertyBuilder {
	private HashMap<String,String> _table;
	
	
	
	public PlainTextConfigPropertyBuilder() {
		this._table = new LinkedHashMap<>();
	}

	@Override
	public void platform(String aValue) {
		// TODO Auto-generated method stub
		_table.put("PLATFORM", aValue);
	}

	@Override
	public void timeout(int aValue) {
		// TODO Auto-generated method stub
		_table.put("TIMEOUT", String.valueOf(aValue));
	}

	@Override
	public void location(String aPath) {
		// TODO Auto-generated method stub
		_table.put("LOCATION", aPath);
	}

	@Override
	public String build() throws ConfigurationError {
		if(!_table.containsKey("LOCATION")){
			throw new ConfigurationError("The LOCATION property must be set!");
		}
		
		StringBuffer sb = new StringBuffer();
		for(String s: _table.keySet()){
			sb.append(s).append("=").append(_table.get(s)).append("\n");
		}
		return sb.toString();
	}

}
