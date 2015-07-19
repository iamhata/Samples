package patterns.Command;

public class Result implements IResult {
	private int _status = IResult.OK;
	private String _msg = "";
	
	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return _status;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return _msg;
	}

	@Override
	public void setStatus(int statusCode) {
		// TODO Auto-generated method stub
		_status = statusCode;
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		_msg = msg;
	}

}
