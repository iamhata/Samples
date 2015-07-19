package test;

import patterns.singleton.FileSystem;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;



public class TestFileSystem {
	@Test
	public void returnSingleInstance(){
		
		FileSystem fs1 = FileSystem.getInstance();
		assertNotNull(fs1);
		
		FileSystem fs2 = FileSystem.getInstance();
		
		assertNotNull(fs2);
		
		assertEquals(fs1,fs2);
		
	}


}
