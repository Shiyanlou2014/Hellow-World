package openWebPage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
//import static io.github.seleniumquery.SeleniumQuery.$;

	public class openFromIE {

		public static void main(String[] args) {
			//Path to the folder where you have extracted the IEDriverServer executable
//			String service = "C:\\Users\\Jessie\\Downloads\\agilea\\IEDriverServer.exe";
//			System.setProperty("webdriver.ie.driver", service);
//			InternetExplorerDriver  driver = new InternetExplorerDriver();
//
//			driver.get("http://yahoo.com");
			
			
//			String exePath = "C:\\Users\\Jessie\\Downloads\\agilea\\IEDriverServer.exe";
//			InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
//			serviceBuilder.usingAnyFreePort(); // This specifies that sever can pick any available free port to start
//			serviceBuilder.usingDriverExecutable(new File(exePath)); //Tell it where you server exe is
//			serviceBuilder.withLogLevel(InternetExplorerDriverLogLevel.TRACE); //Specifies the log level of the server
//			serviceBuilder.withLogFile(new File("C:\\Users\\abc\\Documents\\logFile.txt")); //Specify the log file. Change it based on your system
//			InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
//			InternetExplorerDriver driver = new InternetExplorerDriver(service);
//			driver.get("http://toolsqa.wpengine.com");
//			
//			
//			System.setProperty("webdriver.ie.driver", exePath);
//			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
//			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//			@SuppressWarnings("deprecation")
//			InternetExplorerDriver ieDriver = new InternetExplorerDriver(ieCapabilities);
//			driver.use(ieDriver);
			
			
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			File file = new File("C:\\Users\\Jessie\\Downloads\\agilea\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			WebDriver driver = new InternetExplorerDriver(capabilities);
			driver.get("https://www.google.com/");
			
			
			
		}
	
}
