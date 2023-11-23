package pageobjects;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Baseclasspage {
	
	public Baseclasspage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="loginform-username")
	public WebElement untb;
	
	
	@FindBy(id ="loginform-password")
	public WebElement pwtb;
	
	@FindBy(xpath ="//button[text()='Login']")
	public WebElement login;
	
	public void Login() throws Throwable {
		
		 System.getProperty("user.dir");
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Redeem_Points.properties");
		 Properties prop=new Properties();
		 prop.load(fis); 
		 untb.sendKeys(prop.getProperty("username"));
		 pwtb.sendKeys(prop.getProperty("password"));
		 login.click();
	}

}
