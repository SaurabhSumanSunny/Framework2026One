package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoD {
WebDriver driver;
@BeforeMethod
public void LaunchBrowser()
{
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	driver=new FirefoxDriver();
}
@Test
public void testA()
{
	driver.get("https://www.actitime.com/login-to-product");
	String actual=driver.getTitle();
	SoftAssert sa=new SoftAssert();
	//sa.assertEquals(actual,"Invalid");
	sa.assertEquals(actual,"Login to your actiTIME account");
	driver.findElement(By.id("Enteryouremail")).sendKeys("Bhanu");
	sa.assertAll();
}
@AfterMethod
public void closeBrowser()
{
	driver.quit();
}
}
