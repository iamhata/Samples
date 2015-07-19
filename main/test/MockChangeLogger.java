package test;

import patterns.Observer.IObserver;
import patterns.Observer.ISubject;

public class MockChangeLogger implements IObserver {
	public int _notifiedCount = 0;
	
	@Override
	public void update(ISubject obj) {
		// TODO Auto-generated method stub
		_notifiedCount++;

	}

}
