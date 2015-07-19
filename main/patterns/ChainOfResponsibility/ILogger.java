package patterns.ChainOfResponsibility;

public interface ILogger {
	void write(LogLevel aLevel, String aMsg);
	void setNext(ILogger aLogger);

}
