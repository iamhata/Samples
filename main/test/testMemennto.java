package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.Memento.CareTaker;
import patterns.Memento.Player;

public class testMemennto {
	
	@Test
	public void testMemento() {
		
		CareTaker caretaker = new CareTaker();
		Player player = new Player();
		System.out.println("\n玩定初始狀態");
		player.displayState();
		
		
		//儲存進度0
		System.out.println("\n怕死先存檔[0]...");
		caretaker.saveState(player.createMemento());
		player.displayState();
		
		System.out.println("\n受魔王攻擊");
		player.fight();
		player.displayState();
		
		//儲存進度1
		System.out.println("\n趕快儲存進度[1]...");
		caretaker.saveState(player.createMemento());
		player.displayState();
		
		//戰鬥到死
		player.fightToDead();
		System.out.println("\n戰鬥到死");
		player.displayState();
		
		//載入之前的進度存檔[0]
		System.out.println("\n載入之前的進度存檔[0]");
		player.setMemento(caretaker.getState(0));
		player.displayState();
		
		//改變主意，載入之前的進度存檔[1]
		System.out.println("\n改變主意，載入之前的進度存檔[1]");
		player.setMemento(caretaker.getState(1));
		player.displayState();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
