package patterns.Mediator;

public class Text extends Widget {
	private String value ="";
	public Text(String ID, DialogMediator mediator){
		super(ID, mediator);
	}
	public void setText(String aText){
		value = aText;
	}
	public String getText(){
		return value;
	}
}
