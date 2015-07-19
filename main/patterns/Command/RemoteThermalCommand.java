package patterns.Command;

public class RemoteThermalCommand implements ICommand {

	private RemoteThermal _thermal = null;
	
	public RemoteThermalCommand(String ipAddress){
		_thermal = new RemoteThermal(ipAddress);
	}
	
	@Override
	public IResult execute() {
		// TODO Auto-generated method stub
		IResult result = new Result();
		if(_thermal.isOverheat()){
			result.setStatus(IResult.CRITICAL);
			result.setMessage("溫度過熱:"+toString());
		}
		return result;
	}

}
