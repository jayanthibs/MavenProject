package mavenpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMavenExercise {
	String Expectedtitle = "Facebook- Log In or Sign Up";
	Logger log = LogManager.getLogger(FirstMavenExercise.class.getName());

	@Test
	public void mavenTest() {

	//WebDriverManager.edgedriver().setup();
//	WebDriverManager.firefoxdriver().setup();
	//	WebDriverManager.chromedriver().setup();
		log.info("Driver setup is made");
//System.setProperty("webdriver.chrome.driver","E:\\Jayanthi\\Downloads\\Selenium Download\\chromedriver-win32\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\Drivers\\chromedriver.exe");
//WebDriver driver=new EdgeDriver();
//WebDriver driver=new FirefoxDriver();

ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(chromeOptions);
		log.info("Browser is instantiated");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("Window is Maximized");
//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		log.info("Navigated to facebook home page");
		String title = driver.getTitle();
		try {
			Assert.assertEquals(title, Expectedtitle);
		} catch (Throwable t) {
			log.error("Expected and Actual titles are not matching");
			System.out.println("Title not matched");
		}
	}
}
