package patterns.Template;

public class FileConfigParser extends ConfigParser {
	private String mFileName = null;
	
	public FileConfigParser(String aFileName){
		mFileName = aFileName;
	}
	
	@Override
	protected void readData() {
		// TODO Auto-generated method stub
		System.out.println ("read config data from file:"+ mFileName);
		
	}

	@Override
	protected void parseToken() {
		// TODO Auto-generated method stub
		System.out.println("parseToken....");

	}

	@Override
	protected void buildModel() {
		// TODO Auto-generated method stub
		mPData = new PersonData();
		mPData.setName("Teddy");
		mPData.setHp(100);
	}

	@Override
	protected void validate() {
		// TODO Auto-generated method stub
		System.out.println("validate....");

	}

}
