package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoSuggestiveDropdown {

	WebDriver driver;
	public AutoSuggestiveDropdown(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='autocomplete']")
	WebElement inputTextBox;
	
	public void enterText(String text)
	{
		inputTextBox.sendKeys(text);
	}
	
	public void selectOption()
	{
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'ui-widget-content')]/li"));
		// 3. Iterate over the list
		for (WebElement dropdownOption : options) {
			// 4. Use getText to get text of all the options, and see if it's matched to
			// real value
			if (dropdownOption.getText().equalsIgnoreCase("India")) {
				// 5. And blindly click on matched value and then break to come out from loop
				dropdownOption.click();
				break;
			}
		}
	}
}
