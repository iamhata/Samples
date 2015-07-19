package patterns.Strategy;

public class Player {
	IBatStrategy _strategy = null;
	public Player(IBatStrategy strategy){
		_strategy = strategy;
	}
	void bat(){
		_strategy.swing();
	}
}
