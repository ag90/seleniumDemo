package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

 
 
public class GridDemo {
	
 WebDriver driver;
	
	@Test
	public void demo() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		driver=new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub/"),cap);
		
		driver.get("https://www.google.co.in/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		
	}
	
	
	

}
