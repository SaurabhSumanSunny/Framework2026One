package FrameOne;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class LogInPage extends BasePage{
@FindBy(id="login_field")
private WebElement unTB;
@FindBy(name="password")
private WebElement pwTB;
@FindBy(name="commit")
private WebElement login;
@FindBy(xpath="//div[contains(@class,'flash flash-full flash-error  ')]")
private WebElement errMsg;

public LogInPage(WebDriver driver)
{
	super(driver);
}
public void setUsername(String username)
{
	unTB.sendKeys(username);
}
public void setPassword(String password)
{
	pwTB.sendKeys(password);
}
public void clickLogin()
{
	login.click();
}
public void verifyErrMsgIsPresent(SoftAssert s)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	try
	{
		wait.until(ExpectedConditions.visibilityOf(errMsg));
		Reporter.log("Error Message is Displayed",true);
	}
	catch(Exception e)
	{
		Reporter.log("Error Message is not Displayed",true);
		s.fail();
	}
}

}
