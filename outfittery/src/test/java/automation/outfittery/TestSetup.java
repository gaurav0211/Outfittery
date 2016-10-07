package automation.outfittery;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestSetup {
	public WebDriver driver; 
	static String driverPath = "C:\\selenium\\"; //path of chrome exec
	
	public WebDriver getDriver(){
		return driver;
	}

	private void setDriver(String browserType, String appURL){
		driver = initChromeDriver(appURL);
	}

	private WebDriver initChromeDriver(String appURL) {
		// TODO Auto-generated method stub
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	@AfterMethod
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
}
