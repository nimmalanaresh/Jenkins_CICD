package central.reports;

import org.testng.annotations.Test;

import pageobjects.MultistockMgmtpage;

public class MultistockMgmt extends Baseclass {
	
	@Test
	public void sfrc() throws Throwable {
		Logininfo();
		
		MultistockMgmtpage m = new MultistockMgmtpage(driver);
		m.Msm.click();
		Thread.sleep(6000);
		m.stcktnfsr.click();
		
		
		
			}

}
