package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import patterns.Prototype.Monster;

public class TestCreateMonstersBeforeApplyingPrototype {

	@Test
	public void testCreateMonstersBeforeApplyingPrototype() {
		int max = 50 ;
		Date start = new Date();
		Monster master = new Monster(100,100,"./monster.xml");
		for(int i = 0; i < max;i++){
			Monster clone = master.clone();
		}
		Date end = new Date();
		System.out.println("Creating "+ max + " Monster needs:"+ (end.getTime()-start.getTime())+ "ms");
	}

}
