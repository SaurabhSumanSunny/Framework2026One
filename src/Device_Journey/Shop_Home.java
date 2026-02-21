package Device_Journey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Shop_Home extends BasePage{
	@FindBy(linkText="Shop")
	private WebElement shop1;
	@FindBy(linkText="iPhone")
	private WebElement phone;
	public Shop_Home(WebDriver driver)
	{
		super(driver);
	}
public void hoverShop()
{
	Actions actions=new Actions(driver);
	actions.moveToElement(shop1).perform();
}
public void selectPhone()
{
	phone.click();
}
public void selectPhoneType()
{
	this.hoverShop();
	this.selectPhone();
}
}
