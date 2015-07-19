package patterns.Mediator;

public class ListBox extends Widget {
	public ListBox(String ID, DialogMediator mediator){
		super(ID, mediator);
	}
	public String getSelection(){
		return "細明體";
	}
	public void onSelect(){
		this.changed();
	}
}
