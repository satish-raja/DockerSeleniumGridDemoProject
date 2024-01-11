package base;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
		public WebDriver InitializeBrowser(String browserName) throws MalformedURLException, URISyntaxException {
			DesiredCapabilities dc = new DesiredCapabilities();
			if (browserName.equalsIgnoreCase("chrome")) {
				dc.setBrowserName("chrome");
			}else	if (browserName.equalsIgnoreCase("firefox")) {
				dc.setBrowserName("firefox");
			}else if (browserName.equalsIgnoreCase("edge")) {
				dc.setBrowserName("MicrosoftEdge");
			}
			
			WebDriver driver = new RemoteWebDriver(new URI("http://localhost:4444").toURL(), dc);
			driver.manage().window().maximize();
			return driver; 
			
		}

}
