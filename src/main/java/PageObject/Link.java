package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Link {

	WebDriver driver;
	public Link(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(tagName="a")
	WebElement link;
}
