package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoC {
public WebDriver driver;
@BeforeMethod
public void openBrowser()
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
}
@Test
public void testA()
{
	driver.get("https://www.actitime.com/");
	String actual=driver.getTitle();
	Assert.assertEquals(actual,"Time Tracking Software for Clear, Profitable Projects");
}
@AfterMethod
public void CloseBrowser()
{
	driver.quit();
}
}
