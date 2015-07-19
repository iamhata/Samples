package patterns.factory;

public class WinDriveManager extends DriveManager {

	@Override
	protected Drive createDrive(String type, int index) {
		// TODO Auto-generated method stub
		Drive drive = null;
		switch(type){
		
		case "SATA":
			drive = new WinSATADrive(index);
			break;
		case "USB":
			drive = new WinUSBDrive(index);
			break;
		default:
			throw new RuntimeException("unsupported drive type:"+type);
			
		}
		
		return drive;
	}

}
