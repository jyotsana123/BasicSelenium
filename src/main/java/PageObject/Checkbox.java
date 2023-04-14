package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {
	
	WebDriver driver;
	public Checkbox(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="input[type='checkbox']")
	List<WebElement> checkbox;
	
	@FindBy(id="checkBoxOption3")
	 WebElement option;
	
	public void getCheckboxCount()
	{
		System.out.println("Total no. of checkboxes are " +checkbox.size());
	}
	
	public void selectCheckbox()
	{
		option.click();
	}
}
