package patterns.Mediator;

public class Button extends Widget {
	public Button(String ID, DialogMediator mediator){
		super(ID, mediator);
	}
	public void click(){
		this.changed();
	}
}
