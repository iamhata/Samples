package patterns.Mediator;

public interface DialogMediator {
	void createWidgets();
	void showDialog();
	void closeDialog();
	Widget getWidget(String ID);
	void widgetChanged(Widget aWidget);

}
