package Tests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageObject.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		LandingPage landingpage = new LandingPage(driver);
		landingpage.openWebsite();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Select radio button
		driver.findElement(By.xpath("//fieldset/label[@for='radio1']/input")).click();
		// Get the total no. of radio buttons
		System.out.println("Total no. of radio buttons are "
				+ driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label")).size());

		// Autosuggestive dropdown
		// 1. Provide input
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		Thread.sleep(3000);
		// 2. Figure out the generic locator to extract the all values and then put into
		// the list
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

		//Static dropdown
		// For static dropdown we need to create object of select class, then by the
				// object we will use every method of select class to access the dropdowns
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByValue("option2");
		// To print the value of static dropdown
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		//get total Checkbox count on webpage
		System.out.println("Total no. of checkboxes are " +driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//Select checkbox
		driver.findElement(By.id("checkBoxOption3")).click();
		
		
		//Switch on new tab
		driver.findElement(By.id("opentab")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle()); 
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.className("switch-tab")).getText());
		
		
		//Switch on new window
//		driver.findElement(By.id("openwindow")).click();
//		Set<String> windows1 = driver.getWindowHandles();
//		Iterator<String> it1 = windows.iterator();
//		String parentId1 = it.next();
//		String childId1 = it.next();
//		driver.switchTo().window(childId1);
//		System.out.println(driver.getTitle()); 
//		driver.switchTo().window(parentId1);
//		System.out.println(driver.getTitle());
		
		//Switch on new window
		driver.findElement(By.id("openwindow")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		          System.out.println(driver.getTitle()); 
		         driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		         System.out.println(driver.getTitle());
		          }
		       }
		
		//Alert box
		   driver.findElement(By.id("name")).sendKeys("nishu");
		   driver.findElement(By.id("alertbtn")).click();
		   System.out.println( driver.switchTo().alert().getText());  //get the text of alert box
		   driver.switchTo().alert().accept();   //Accept alert 
		   driver.findElement(By.id("confirmbtn")).click();
		   System.out.println( driver.switchTo().alert().getText());
		   driver.switchTo().alert().dismiss();    //cancel alert
		   
	}

}
