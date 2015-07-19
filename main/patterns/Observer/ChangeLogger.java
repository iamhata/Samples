package patterns.Observer;

import java.util.Date;

public class ChangeLogger implements IObserver {

	@Override
	public void update(ISubject obj) {
		// TODO Auto-generated method stub
		writerChangeLoge(((MonitoredItem ) obj).getState(),new Date() );

	}
	private void writerChangeLoge(State aState,Date aDate){
		
	}

}
