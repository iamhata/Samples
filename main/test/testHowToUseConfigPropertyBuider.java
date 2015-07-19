package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.Builder.ConfigPropertyBuilder;
import patterns.Builder.ConfigurationError;
import patterns.Builder.JsonConfigPropertyBuilder;
import patterns.Builder.PlainTextConfigPropertyBuilder;

public class testHowToUseConfigPropertyBuider {
	
	@Test
	public void testHowToUsePlainTextConfigPropertyBuider() throws ConfigurationError{
		ConfigPropertyBuilder builder = new PlainTextConfigPropertyBuilder();
		builder.timeout(30);
		builder.platform("Ubuntu");
		builder.location("\\opt\\property.txt");
		System.out.println(builder.build());
		assertEquals("TIMEOUT=30\nPLATFORM=Ubuntu\nLOCATION=\\opt\\property.txt\n",builder.build());
	}
	@Test
	public void testHowToUseJsonConfigPropertyBuider() throws ConfigurationError{
		ConfigPropertyBuilder builder = new JsonConfigPropertyBuilder();
		builder.timeout(30);
		builder.platform("Ubuntu");
		builder.location("\\opt\\property.txt");
		
		assertEquals("{\"PLATFORM\":\"Ubuntu\",\"TIMEOUT\":30,\"LOCATION\":\"\\opt\\property.txt\"}",builder.build());
	}

}
