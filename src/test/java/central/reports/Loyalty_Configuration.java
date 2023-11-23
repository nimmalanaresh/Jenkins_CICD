package central.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Loyalty_Configurationpage;

public class Loyalty_Configuration extends Baseclass {
	
	@Test
	public void Loyalty() throws Throwable {
		
		Loyalty_Configurationpage l = new Loyalty_Configurationpage(Baseclass.driver);
		l.Click_Loyalty();
		String actual = "Loyalty Settings";
		String expected = Baseclass.driver.getTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		l.Update_Loyalty_Points();
		l.Submit();
		}
}