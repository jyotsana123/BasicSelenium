package Tests;

import org.testng.annotations.Test;

import PageObject.AutoSuggestiveDropdown;
import TestComponent.BaseTest;

public class AutoSuggestiveDropdownTest extends BaseTest {

	
	AutoSuggestiveDropdown autosuggestivedropdown;
	@Test
	public void enterText()
	{
		autosuggestivedropdown = new AutoSuggestiveDropdown(driver);
		autosuggestivedropdown.enterText("ind");
		autosuggestivedropdown.selectOption();
	}
}
