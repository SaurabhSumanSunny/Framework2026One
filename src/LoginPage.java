import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private WebElement username, password,loginBtn;
JavascriptExecutor js;
public LoginPage(WebDriver driver)
{
	username=driver.findElement(By.id("login-username"));
	password=driver.findElement(By.id("login-password"));
	loginBtn=driver.findElement(By.xpath("//span[text()='Log in']/.."));
	js = (JavascriptExecutor) driver;
	
}
public void login(String un, String pw) throws InterruptedException
{
	username.sendKeys(un);
	password.sendKeys(pw);
	Thread.sleep(2000);
	
	js.executeScript("arguments[0].click();", loginBtn);
}
}
