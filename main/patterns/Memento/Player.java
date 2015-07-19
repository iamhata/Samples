package patterns.Memento;

public class Player {
	private int hp = 100;
	private int ep = 100;
	
	
	public static class Memento{
		private final int _hp;
		private final int _ep;
		
		private Memento(int aHP,int aEP){
			_hp = aHP;
			_ep = aEP;
		}
		
		private int get_hp() {
			return _hp;
		}
		private int get_ep() {
			return _ep;
		}
	}
	
	
	public Memento createMemento(){
		return new Memento(hp, ep);
	}
	public void setMemento (Memento aMemento){
		hp = aMemento.get_hp();
		ep = aMemento.get_ep();
	}
	
	public void fight(){
		hp = hp - 10;
		ep = ep +5;
	}
	public void fightToDead(){
		hp = 0 ;
		ep = 0 ;
	}
	public void displayState(){
		System.out.println("家狀態");
		System.out.println("生命力"+hp);
		System.out.println("經驗值"+ep);
	}
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getEp() {
		return ep;
	}
	public void setEp(int ep) {
		this.ep = ep;
	}
	

}
