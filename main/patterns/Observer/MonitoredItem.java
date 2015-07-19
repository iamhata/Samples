package patterns.Observer;

import java.util.LinkedList;
import java.util.List;

public class MonitoredItem implements ISubject {
	private List<IObserver> _observer = new LinkedList<>();
	private State _state = State.OK;
	
	@Override
	public void addObserver(IObserver obj) {
		// TODO Auto-generated method stub
		_observer.add(obj);

	}

	@Override
	public void deleteObserver(IObserver obj) {
		// TODO Auto-generated method stub
		_observer.remove(obj);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(IObserver obj:_observer){
			obj.update(this);
		}
	}
	public void changeState(State aNewState){
		_state = aNewState;
		this.notifyObserver();
	}
	public State getState(){
		return _state;
	}
}
