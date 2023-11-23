package central.reports;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.Offerspage;

public class Offers extends Baseclass{
@Test

	public void offers() {
		
		Offerspage o = new Offerspage(driver);
		o.offers.click();
		o.create.click();
		o.offername.sendKeys("bogo");
		o.offerdesc.sendKeys("pandagoo");
		
		
		Select s = new Select(o.dd);
	//	s.selectByIndex(0);
		s.selectByIndex(1);
	
		Select ss = new Select(o.offertype);
		ss.selectByIndex(1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500) ", "o.prodname");
		
		o.buyproduct.sendKeys("app");
		o.prodname.click();
		o.offerprod.sendKeys("app");
		o.prodname.click();
		o.date1.click();
		o.startdate.click();
		o.date2.click();
		o.enddate.click();
//		o.submit.click();
//		o.edit.click();
//		o.accept.click();
//		o.comments.sendKeys("hgjghhjv");
//		o.submitcomments.click();
//		driver.switchTo().alert().accept();
//		o.radiobtn.click();
	}
}
