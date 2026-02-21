package Device_Journey;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConstOne{
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void precondition(String browser) throws MalformedURLException
	{
		String hubUrl="http://192.168.0.102:4444";
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability("browserName",browser);
		driver=new RemoteWebDriver( new URL(hubUrl),ds);
		/*if(browser.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();	
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ee.co.uk");
	}
@AfterTest
public void postcondition()
{
	driver.quit();
}
}
