package central.reports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.Baseclasspage;

public class Testing {
	
	WebDriver driver;
	
	@Test(enabled = false)

	public void test() throws Throwable {
		
		Baseclass b = new Baseclass();
		b.Logininfo();
		
		System.out.println("Njoy pandgoo");
		
	}
	
	@Test
	public void test2() throws Throwable {
		
		Baseclasspage bp = new Baseclasspage(driver);
		bp.Login();
		
	}
}
