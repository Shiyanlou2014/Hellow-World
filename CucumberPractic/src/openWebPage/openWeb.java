package openWebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class openWeb {
	 
	public static void main(String[] args) throws InterruptedException  {
		
		//Select one of following two 
		
		// 1
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		
		//2
		//Now you can Initialize marionette driver to launch firefox
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		//WebDriver driver = new MarionetteDriver(capabilities); 
		
		
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();

		// Tell the Java bindings to use Marionette.
		// This will not be necessary in the future,
		// when Selenium will auto-detect what remote end
		// it is talking to.
		//capabilities.setCapability("marionette", true);

		//WebDriver driver = new RemoteWebDriver(capabilities); 
		
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
		
			Thread.sleep(5000);
		
        // Close the driver
        driver.quit();
    }
}