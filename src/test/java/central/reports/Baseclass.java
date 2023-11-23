package central.reports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import pageobjects.Baseclasspage;



public class Baseclass {
	
public static WebDriver driver;
 @BeforeTest
 public  void Logininfo() throws Throwable {

//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nukkadshops\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://reports.nukkadshops.com/new/");
		Baseclasspage b = new Baseclasspage(driver);
		b.Login();
 }
 
 @AfterTest
 public void Close() {
	 
	 driver.close();
	 }
}
