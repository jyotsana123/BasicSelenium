package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	WebDriver driver;
	public StaticDropdown(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dropdown-class-example")
	WebElement dropdown;
	
	public void selectDropdown()
	{
		Select s = new Select(dropdown);
		s.selectByValue("option2");
	}
	
	public void printSelectedDropdown()
	{
		Select s = new Select(dropdown);
		s.selectByValue("option2");
		System.out.println(s.getFirstSelectedOption().getText());
	}
}
