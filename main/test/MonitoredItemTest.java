package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.Observer.MonitoredItem;
import patterns.Observer.State;

public class MonitoredItemTest {

	@Test
	public void notifyOberverOK() {
		MonitoredItem mi = new MonitoredItem();
		MockChangeLogger logger = new MockChangeLogger();
		mi.addObserver(logger);
		
		assertEquals(0,logger._notifiedCount);
		mi.changeState(State.CRITICAL);
		assertEquals(1,logger._notifiedCount);
		
		mi.changeState(State.CRITICAL);
		assertEquals(2,logger._notifiedCount);
	}

}
