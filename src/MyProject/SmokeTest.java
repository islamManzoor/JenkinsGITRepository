package MyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest 
{
  @Test
  public void loginTest()
  {
	  System.setProperty("webdriver.gecko.driver",
              "C:\\Program Files\\Firefox Nightly\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.mycabtravel.com");
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("firstTab")));
		
		WebElement signin = driver.findElement(By.linkText("SIGN IN"));
		signin.click();
		
		driver.findElement(By.id("inputUserName:input")).sendKeys("pincode");
		driver.findElement(By.id("inputPassword:input")).sendKeys("abc12");
		driver.findElement(By.id("loginBtnId")).click();
		
		WebDriverWait waitafterlogin = new WebDriverWait(driver,15);
		waitafterlogin.until(ExpectedConditions.elementToBeClickable(By.id("firstTab")));
	  
	        driver.close();
  }
}
