package patterns.Template;

public class DBConfigParser extends ConfigParser {
	private String mDBName = null;
	
	public DBConfigParser(String aDBName){
		mDBName = aDBName;
	}
	
	@Override
	protected void readData() {
		// TODO Auto-generated method stub
		System.out.println ("read config data from file:"+ mDBName);
		
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
		mPData.setName("Kay");
		mPData.setHp(50);
	}

	@Override
	protected void validate() {
		// TODO Auto-generated method stub
		System.out.println("validate....");

	}

}
