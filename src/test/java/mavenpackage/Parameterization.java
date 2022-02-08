package mavenpackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {
	@Test
	@Parameters({"browser"}) // we can pass value from suite level or test level
	public void parameterizedTest(String browser){
		if(browser.equals("firefox")){
			System.out.println("Open Firefox Driver");
		}else if(browser.equals("chrome")){
			System.out.println("Open Chrome Driver");
		}
	}
	
	@Test
    @Parameters ("message")
    public void optional( @Optional("Optional Parameter Selected") String message) {
        System.out.println(message);
    }
}