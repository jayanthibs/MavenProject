package mavenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	WebDriver driver;
	String ExpectedTitle;
  @BeforeTest
  public void launchBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  ExpectedTitle = "Google";
	  driver.navigate().to("https://www.google.com/");
  }
  
  @AfterTest
  public void closeBrowser() {
	  
	 // driver.close();
	  
  }
  
  @Test
  public void verifyTitle() {
	  	  
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  System.out.println("verifyTitle Method is running on Thread : " + Thread.currentThread().getId());
  }
}
