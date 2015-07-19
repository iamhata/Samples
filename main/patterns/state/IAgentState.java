package patterns.state;

public interface IAgentState {
	public void search(AgentV2 aAgent);
	public void fight(AgentV2 aAgent);
	public void hit(AgentV2 aAgent);
	public void heal(AgentV2 aAgent);

}
