package openWebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openFromChrome {
 
	public static void main(String[] args) throws InterruptedException {
		String exePath = "C:\\Users\\Jessie\\Downloads\\agilea\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		Thread.sleep(300);
		driver.quit();
		
	}
}