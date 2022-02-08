package mavenpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMavenExercise {
	String Expectedtitle = "Facebook - Log In or Sign Up";
@Test
public void mavenTest() {
//	WebDriverManager.edgedriver().setup();
//	WebDriverManager.firefoxdriver().setup();
	WebDriverManager.chromedriver().setup();
//System.setProperty("webdriver.chrome.driver","E:\\Jayanthi\\Downloads\\Selenium Download\\chromedriver_win32\\chromedriver.exe");
//WebDriver driver=new EdgeDriver();
//WebDriver driver=new FirefoxDriver();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.get("https://www.facebook.com/");
driver.navigate().to("https://www.facebook.com/");
String title=driver.getTitle();
Assert.assertEquals(title, Expectedtitle);


}
}
