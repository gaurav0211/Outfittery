package automation.outfittery;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;


public class Tests extends TestSetup{
public WebDriver driver;


	@BeforeClass
	public void setup(){
		driver=getDriver();
		}
	@Test
	public void customerLogin(){
		LandingPageObjects landingPage=new LandingPageObjects(driver);
		landingPage.getLandingPageTitle();
		landingPage.verifyLandingPageTitle();
		landingPage.kundenLogin();
		landingPage.username(driver).sendKeys("abc@gmail.com");
		landingPage.password(driver).sendKeys("abc123");
		landingPage.submit(driver).click();
}
}
