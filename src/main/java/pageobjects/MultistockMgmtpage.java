package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultistockMgmtpage {
	
	public  MultistockMgmtpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()=' Multi Store Stock Transfer']")
	public WebElement Msm;

	@FindBy(xpath ="//span[text()='Stock Transfer']")
	public WebElement stcktnfsr;
	
	@FindBy(id ="select2-drop-mask")
	public WebElement src;
	
	@FindBy(xpath ="//span[text()='Inventory Items']")
	public WebElement items;
	
	@FindBy(xpath ="//span[text()='Masters']")
	public WebElement hii;
}	

	
