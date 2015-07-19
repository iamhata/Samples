package patterns.Template;

public abstract class ConfigParser {
	protected PersonData mPData = null;
	
	public final PersonData doParse(){
		readData();
		parseToken();
		buildModel();
		validate();
		return mPData;
	}
	abstract protected void readData();
	abstract protected void parseToken();
	abstract protected void buildModel();
	abstract protected void validate();
}
