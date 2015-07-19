package patterns.Command;

public class RemoteWindowCommand implements ICommand{

	private RemoteWindow _window = null;
	
	public RemoteWindowCommand(String ipAddress){
		_window = new RemoteWindow(ipAddress);
	}
	
	@Override
	public IResult execute() {
		// TODO Auto-generated method stub
		IResult result = new Result();
		String msg = null;
		if(_window.isBroken()){
			result.setStatus(IResult.CRITICAL);
			msg = "窗戶被打破";
		}
		if(_window.isOpen()){
			result.setStatus(IResult.CRITICAL);
			msg = "窗戶被打開"+toString();
		}
		if (null != msg)
			result.setMessage(msg + " :"+toString());
		
		return result;
	}
}
