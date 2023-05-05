package Tests;

import org.testng.annotations.Test;

public class dependsOnMethod {

	@Test (dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() {
		  System.out.println("This will execute second (SignIn)");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("This will execute first (Open Browser)");
	  }
}
