package PageObject;

import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void openWebsite()
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
}
