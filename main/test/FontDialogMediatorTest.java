package test;

import static org.junit.Assert.*;

import org.junit.Test;

import patterns.Mediator.DialogMediator;
import patterns.Mediator.FontDialogMediator;
import patterns.Mediator.ListBox;
import patterns.Mediator.Text;
import patterns.Mediator.Button;;

public class FontDialogMediatorTest {

	@Test
	public void FontDialogMediatorTest() {
		DialogMediator mediator = new FontDialogMediator();
		mediator.createWidgets();
		mediator.showDialog();
		assertEquals("",((Text) mediator.getWidget(FontDialogMediator.FONTNAME_ID)).getText());
	
		((ListBox) mediator.getWidget(FontDialogMediator.FONTLIST_ID)).onSelect();
		((Button) mediator.getWidget(FontDialogMediator.OKBUTTON_ID)).click();
		assertEquals("細明體",((Text) mediator.getWidget(FontDialogMediator.FONTNAME_ID)).getText());
	
	}

}
