package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RadioButtons {

	WebDriver driver;
	public RadioButtons(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//fieldset/label[@for='radio1']/input")
	WebElement radiobutton;
	
	@FindBy(xpath="//div[@id='radio-btn-example']/fieldset/label")
	List <WebElement> totalRadioButtons;
	
	public void selectRadioButton()
	{
		radiobutton.click();
	}
	
	public void getTotalCountOfRadioButtons()
	{
		System.out.println("Total no. of radio buttons are " + totalRadioButtons.size());
	}
}
