package FrameOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	@FindBy(xpath="//img[@data-testid='github-avatar']")
	private WebElement menu;
	@FindBy(xpath="//span[text()='Sign out']")
	private WebElement signOut;
public HomePage(WebDriver driver)
{
	super(driver);
}
public void clickMenu()
{
	menu.click();
}
public void clickLogout()
{
	signOut.click();
}
}
