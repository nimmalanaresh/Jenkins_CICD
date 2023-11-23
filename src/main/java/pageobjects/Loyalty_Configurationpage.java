package pageobjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loyalty_Configurationpage {
	
	
	
	
	public Loyalty_Configurationpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//a[@href='/new/group-loyalty/add']"))
	public WebElement Loyalty_Option;
	
	@FindBy(xpath=("//input[@id='grouployalty-min_loyalty_points']"))
	public WebElement Minimum_Loyalty_Points;
	
	@FindBy(xpath=("//input[@id='grouployalty-pos_amount']"))
	public WebElement Earning_Amount;
	
	@FindBy(xpath=("//input[@id='grouployalty-pos_points']"))
	public WebElement Earning_Points;
	
	@FindBy(xpath=("//input[@id='grouployalty-pos_redeem_points']"))
	public WebElement Redeem_Points;
	
	@FindBy(xpath=("//input[@id='grouployalty-pos_redeem_amount']"))
	public WebElement Redeem_Amount;
	
	@FindBy(xpath=("//button[@type='submit']"))
	public WebElement Submit_Button;
	
	@FindBy(xpath=("//div[@id='w1']"))
	public WebElement Success_Message;
	
	
	public void Click_Loyalty() {
		
		Loyalty_Option.click();
	}
	
	public void Update_Loyalty_Points() throws Throwable {
		
		 System.getProperty("user.dir");
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Redeem_Points.properties");
		 Properties prop=new Properties();
		 prop.load(fis);
		
		Minimum_Loyalty_Points.clear();
		Minimum_Loyalty_Points.sendKeys(prop.getProperty("Minimum_Loyalty_Points"));
		Earning_Amount.clear();
		Earning_Amount.sendKeys(prop.getProperty("Earning_Amount"));
		Earning_Points.clear();
		Earning_Points.sendKeys(prop.getProperty("Earning_Points"));
		Redeem_Points.clear();
		Redeem_Points.sendKeys(prop.getProperty("Redeem_Points"));
		Redeem_Amount.clear();
		Redeem_Amount.sendKeys(prop.getProperty("Redeem_Amount"));
	}
	
	public void Submit() {
		
		Submit_Button.click();
		String str =  Success_Message.getText();
		System.out.println(str);
	}

}
