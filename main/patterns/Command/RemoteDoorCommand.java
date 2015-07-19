package patterns.Command;

public class RemoteDoorCommand implements ICommand {
	private RemoteDoor _door = null;
	
	public RemoteDoorCommand(String ipAddress){
		_door = new RemoteDoor(ipAddress);
	}
	public RemoteDoorCommand(RemoteDoor door){
		_door = door;
	}
	
	@Override
	public IResult execute() {
		// TODO Auto-generated method stub
		
		IResult result = new Result();
		if("open".equals(_door.getDoorStatus())){
			result.setStatus(IResult.CRITICAL);
			result.setMessage("門被開啟:"+toString());
		}
		return result;
	}

}
