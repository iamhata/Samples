package patterns.Mediator;

public abstract class Widget {
	private String _id = null;
	protected DialogMediator _mediator = null;
	public Widget(String ID, DialogMediator mediator){
		_id = ID;
		_mediator = mediator;
	}
	public String getID(){
		return _id;
	}
	public void changed(){
		_mediator.widgetChanged(this);
	}

}
