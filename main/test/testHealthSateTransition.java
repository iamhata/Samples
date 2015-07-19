package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.state.AgentV2;
import patterns.state.Dead;
import patterns.state.Dying;
import patterns.state.Health;
import patterns.state.Injured;

public class testHealthSateTransition {

	@Test
	public void testHealthStateTransition(){
		AgentV2 agent = new AgentV2();
		assertNotNull(agent.getState());
		assertEquals("Test default state",Health.class,agent.getState().getClass());
		agent.heal(80);
		assertEquals("Test heal(Health - > Health)",100,agent.getHP());
		assertEquals(Health.class,agent.getState().getClass());
		
		agent.hit(30);
		assertEquals("Test hit(Health -> Health)",Health.class,agent.getState().getClass());
		agent.hit(1);
		assertEquals("Test hit(Health -> Injured",Injured.class,agent.getState().getClass());
		
		agent.heal(31);
		assertEquals(100,agent.getHP());
		assertEquals("Test heal(Injured->Health)",Health.class,agent.getState().getClass());
		
		agent.hit(81);
		assertEquals(19,agent.getHP());
		assertEquals("Test hit(Health->Dying)",Dying.class,agent.getState().getClass());
		
		
		agent.heal(2);
		assertEquals(21,agent.getHP());
		assertEquals("Test hit(Dying->Injured)",Injured.class,agent.getState().getClass());
		
	}
}
