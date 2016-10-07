package automation.outfittery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPageObjects {

	public static WebDriver driver;
	private static WebElement element = null;
		
	//public By kundenLogin=By.className("login open-login");
	//public By mail=By.id("username");
//	public By password=By.id("password");
	//public By submit=By.id("submit");
	
	LandingPageObjects(WebDriver driver) {
		LandingPageObjects.driver=driver;
		}
	public String getLandingPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
		}
	public boolean verifyLandingPageTitle() {
		String expectedTitle = "OUTFITTERY - Shopping f�r M�nner";
		return getLandingPageTitle().contains(expectedTitle);
		}
	public void kundenLogin() {
		driver.findElement(By.linkText("Kunden Login")).click();
		//driver.findElement(By.className("login open-login")).click();
		}
	
	public WebElement username(WebDriver driver){
		 element = driver.findElement(By.id("username"));
         return element;
        }
	public WebElement password(WebDriver driver){
		 element = driver.findElement(By.id("password"));
        return element;
       }
	public WebElement submit(WebDriver driver){
		 element = driver.findElement(By.id("submit"));
       return element;
      }
}
