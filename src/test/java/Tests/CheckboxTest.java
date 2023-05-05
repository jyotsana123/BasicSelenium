package Tests;



import org.testng.annotations.Test;

import PageObject.Checkbox;
import TestComponent.BaseTest;

public class CheckboxTest extends BaseTest {

	Checkbox checkbox;
	@Test
	public void getCheckboxCount()
	{
		checkbox = new Checkbox(driver);
		checkbox.getCheckboxCount();
	}
	
	@Test
	public void selectCheckbox()
	{
		checkbox.selectCheckbox();
	}
	
	
}
