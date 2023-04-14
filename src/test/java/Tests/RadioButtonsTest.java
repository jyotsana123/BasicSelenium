package Tests;

import org.testng.annotations.Test;

import PageObject.RadioButtons;
import TestComponent.BaseTest;

public class RadioButtonsTest extends BaseTest{

	RadioButtons radiobuttons;
	
	@Test
	public void selectRadioButton()
	{
		radiobuttons = new RadioButtons(driver);
		radiobuttons.selectRadioButton();
	}
	
	@Test
	public void totalCountOfRadioButton()
	{
		radiobuttons.getTotalCountOfRadioButtons();
	}
	
}
