package patterns.ChainOfResponsibility;

import java.util.Date;

public class ConsoleLogger implements ILogger {
	private ILogger _next = null;
	
	@Override
	public void write(LogLevel aLevel, String aMsg) {
		String msg = aLevel + ": "+new Date() + ", "+aMsg;
		
		if(LogLevel.Info == aLevel){
			System.out.println(msg);
		}
		if(_next != null){
			_next.write(aLevel, aMsg);
		}
	}

	@Override
	public void setNext(ILogger aLogger) {
		_next = aLogger;

	}

}
