package patterns.ChainOfResponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

public class FileLogger implements ILogger {
	private PrintStream _os;
	private ILogger _next = null;
	
	public FileLogger(String aFileName){
		try{
			_os = new PrintStream(aFileName);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void write(LogLevel aLevel, String aMsg) {
		String msg = aLevel +": "+ new Date() + ", " +aMsg;
		
		if(LogLevel.Debug == aLevel){
			_os.println(msg);
			System.out.println("==> Write to file: "+ msg);
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
