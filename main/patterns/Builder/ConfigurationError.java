package patterns.Builder;

public class ConfigurationError extends Exception {
	private static final long serialVersionUID = 7051208859298301622L;
	public ConfigurationError(){
		super();
	}
	public ConfigurationError(String aStr){
		super(aStr);
	}

}
