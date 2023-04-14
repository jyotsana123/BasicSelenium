package Tests;

import org.testng.annotations.Test;

import PageObject.StaticDropdown;
import TestComponent.BaseTest;

public class StaticDropdownTest extends BaseTest {

	StaticDropdown staticdropdown;
	
	@Test
	public void selectFropdown()
	{
		staticdropdown = new StaticDropdown(driver);
		staticdropdown.selectDropdown();
	}
	
	@Test
	public void printSelectedDropdown()
	{
		staticdropdown = new StaticDropdown(driver);
		staticdropdown.printSelectedDropdown();
	}
}
