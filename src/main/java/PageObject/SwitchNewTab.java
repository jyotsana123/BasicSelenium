package PageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchNewTab {

	WebDriver driver;
	public SwitchNewTab(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="opentab")
	WebElement openWindowButton;
	
	public void clickOnOpenWindowButton()
	{
		openWindowButton.click();
	}
	
	public void getTitleOfChildWindow()
	{
		Set<String>windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}
	
//	public void getTitleOfParentWindow()
//	{
//		Set<String>windows = driver.getWindowHandles();
//		Iterator<String> it= windows.iterator();
//		String parentId = it.next();
//		String childId = it.next();
//		driver.switchTo().window(parentId);
//		System.out.println(driver.getTitle());
//	}
	
	
	
	
	
	//Switch on new tab
//			driver.findElement(By.id("opentab")).click();
//			Set<String> windows = driver.getWindowHandles();
//			Iterator<String> it = windows.iterator();
//			String parentId = it.next();
//			String childId = it.next();
//			driver.switchTo().window(childId);
//			System.out.println(driver.getTitle()); 
//			driver.switchTo().window(parentId);
//			System.out.println(driver.findElement(By.className("switch-tab")).getText());
			
	
}
