package FrameOne;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest implements AutoConst{
	public WebDriver driver;
@BeforeMethod
public void preCondition()
{
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://github.com/login");
	
}
@AfterMethod
public void postCondition()
{
	driver.quit();
}
}
