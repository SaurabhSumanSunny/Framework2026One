package FirstP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
@FindBy(id="username")
private WebElement unTB;
public LoginPage(WebDriver driver)
{
	super(driver);
}
}
