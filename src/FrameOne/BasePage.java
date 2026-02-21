package FrameOne;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void verifyTitle(String eTitle)
{
	try
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Expected Page is displayed "+eTitle,true);
		Reporter.log("Done",true);
	}
	catch(TimeoutException e)
	{
		Reporter.log("Expected Page is not displayed",true);
		Assert.fail();
	}
}
}
