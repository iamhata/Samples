package patterns.Mediator;


import java.util.HashMap;

public class FontDialogMediator implements DialogMediator {
	public final static String FONTLIST_ID = "fontList";
	public final static String FONTNAME_ID = "fontName";
	public final static String OKBUTTON_ID ="okButton";
	private ListBox fontList;
	private Text fontName;
	private Button okButton;
	private HashMap<String,Widget> _components;
	
	@Override
	public void createWidgets() {
		// TODO Auto-generated method stub
		fontList = new ListBox(FONTLIST_ID,this);
		fontName = new Text(FONTNAME_ID,this);
		okButton = new Button(OKBUTTON_ID,this);
		_components = new HashMap<>();
		_components.put(fontList.getID(), fontList);
		_components.put(okButton.getID(), okButton);
		_components.put(fontName.getID(), fontName);
		System.out.println("Create widgets");
	}

	@Override
	public void showDialog() {
		// TODO Auto-generated method stub
		System.out.println("Show the font dialog with a font list, a font name, and an OK button.");
	}

	@Override
	public void closeDialog() {
		// TODO Auto-generated method stub
		System.out.println("Close the font dialog.");
	}

	@Override
	public Widget getWidget(String ID) {
		// TODO Auto-generated method stub
		return _components.get(ID);
	}

	@Override
	public void widgetChanged(Widget aWidget) {
		// TODO Auto-generated method stub
		if(aWidget == fontList){
			setFontTextAsFontListSelectedItem();
		}else if(aWidget == okButton){
			applyFontChangeAndDissmissDialog();
		}
	}
	private void setFontTextAsFontListSelectedItem(){
		System.out.println("Set text value to the selected item in the font list");
		fontName.setText(fontList.getSelection());
	}
	private void applyFontChangeAndDissmissDialog(){
		System.out.println("Apply font change and dismiss dialog");
		this.closeDialog();
	}

}
