package Tests;

import org.testng.annotations.Test;

import PageObject.SwitchNewTab;
import TestComponent.BaseTest;

public class SwitchNewTabTest extends BaseTest {

	SwitchNewTab switchnewtab;
	
	@Test
	public void getTitleOfChildWindow()
	{
		switchnewtab = new SwitchNewTab(driver);
		switchnewtab.clickOnOpenWindowButton();
		switchnewtab.getTitleOfChildWindow();
	}
}
