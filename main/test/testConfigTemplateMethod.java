package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.Template.ConfigParser;
import patterns.Template.DBConfigParser;
import patterns.Template.FileConfigParser;
import patterns.Template.PersonData;

public class testConfigTemplateMethod {

	@Test
	public void test() {
		ConfigParser fileParser = new FileConfigParser("C:\\config.ini");
		PersonData fpd = fileParser.doParse();
		assertEquals("Teddy",fpd.getName());
		assertEquals(100,fpd.getHp());
		
		
		ConfigParser dbParser = new DBConfigParser("http://127.0.0.1/hsql/mydb");
		PersonData dpd = dbParser.doParse();
		assertEquals("Kay",dpd.getName());
		assertEquals(50,dpd.getHp());
		
		
	}

}
