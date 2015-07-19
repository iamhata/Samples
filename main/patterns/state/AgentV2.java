package patterns.state;

public class AgentV2 {
	public static final int HEALTH_LOW_LIMIT = 70;
	public static final int INJURED_LOW_LIMIT = 20;
	public static final int DYING_LOW_LIMIT = 1;
	public static final int DEAD_LOW_LIMIT = 0;
	private static int MAX_HP = 100;
	
	private IAgentState _currentState = null;
	private int _HP = 0 ;
	public AgentV2(){
		_currentState = new Health();
		_HP = MAX_HP;
	}
	public int getHP(){
		return _HP;
	}
	public IAgentState getState(){
		return _currentState;
	}
	public void search(){
		_currentState.search(this);
	}
	public void fight(){
		_currentState.fight(this);
	}
	public void hit(int aValue){
		if(_HP - aValue >= DEAD_LOW_LIMIT)
			_HP = _HP - aValue;
		_currentState.hit(this);
	}
	public void heal(int aValue){
		if(_HP + aValue <= MAX_HP)
			_HP = _HP + aValue;
		_currentState.heal(this);
	}
	public void changeState(IAgentState aState){
		_currentState = aState;
	}
	

}
