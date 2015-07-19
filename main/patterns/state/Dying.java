package patterns.state;

public class Dying implements IAgentState {

	@Override
	public void search(AgentV2 aAgent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fight(AgentV2 aAgent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hit(AgentV2 aAgent) {
		// TODO Auto-generated method stub
		if(aAgent.getHP() < AgentV2.DYING_LOW_LIMIT)
			aAgent.changeState(new Dead());
	}

	@Override
	public void heal(AgentV2 aAgent) {
		// TODO Auto-generated method stub
		if(aAgent.getHP() > AgentV2.INJURED_LOW_LIMIT)
			aAgent.changeState(new Injured());

	}

}
