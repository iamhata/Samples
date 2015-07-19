package patterns.Proxy;

public class UIDescriptionManagerImpl implements UIDescriptionManager {

	@Override
	public String getDescription(String aID)
			throws DescriptionNotFoundException {
		
		return LoadDescriptionFromDatabase();
	}
	private String LoadDescriptionFromDatabase(){
		System.out.println("Loading description from database needs 2 seconds...");
		sleepMillisecond(2000);
		return "";
	}
	private void sleepMillisecond(int ms){
		try{
			Thread.sleep(ms);
		}catch(InterruptedException e){
			
		}
	}
}
