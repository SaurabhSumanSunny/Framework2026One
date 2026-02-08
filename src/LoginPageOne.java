import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOne {
WebDriver driver;
JavascriptExecutor js;

@FindBy(id="login-username")
private WebElement username;
@FindBy(id="login-password")
private WebElement password;
@FindBy(xpath="//span[text()='Log in']/..")

private WebElement LoginBtn;
@FindBy(xpath="//span[text()='OK']/..")
private WebElement okbutton;


public LoginPageOne(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void login(String un, String pw) throws InterruptedException
{
	username.sendKeys(un);
	password.sendKeys(pw);
	Thread.sleep(2000);
	js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",LoginBtn);
	Thread.sleep(3000);
	js.executeScript("arguments[0].click();",okbutton);
	driver.navigate().refresh();
}
}
