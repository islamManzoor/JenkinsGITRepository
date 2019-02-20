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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("SIGN IN")).click();
		
		driver.quit();
  }
}
