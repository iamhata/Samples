package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.ChainOfResponsibility.ConsoleLogger;
import patterns.ChainOfResponsibility.FileLogger;
import patterns.ChainOfResponsibility.ILogger;
import patterns.ChainOfResponsibility.LogLevel;

public class tesChainOfResponsibility {

	@Test
	public void test() {
		ILogger logger = new ConsoleLogger();
		logger.setNext(new FileLogger("./logger.txt"));
		
		
		logger.write(LogLevel.Debug, "This is a debug message.");
		logger.write(LogLevel.Info, "This is an info message.");
	}

}
