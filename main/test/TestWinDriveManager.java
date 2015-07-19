package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.factory.Drive;
import patterns.factory.DriveManager;
import patterns.factory.LinuxSATADrive;
import patterns.factory.LinuxUSBDrive;
import patterns.factory.WinDriveManager;
import patterns.factory.WinSATADrive;
import patterns.factory.WinUSBDrive;

public class TestWinDriveManager {

	@Test
	public void createWinDreive() {
		DriveManager dm= new WinDriveManager();
		Drive drive = dm.getDrive("USB", 0);
		assertEquals(WinUSBDrive.class,drive.getClass());
		assertEquals(WinSATADrive.class,drive.getClass());
		assertEquals(LinuxUSBDrive.class,drive.getClass());
		assertEquals(LinuxSATADrive.class,drive.getClass());
	}
	
	@Test
	public void createUnsupportWinSASDrive(){
		DriveManager dm = new WinDriveManager();
		
		try{
			Drive drive = dm.getDrive("SAS", 0);
			fail("Infessible path.");
			
		}catch(RuntimeException e){
			assertTrue("Unsupported rive type 'SAS' throws a RuntimeException",true);
		}
	}

}
