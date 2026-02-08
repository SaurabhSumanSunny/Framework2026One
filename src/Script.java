import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://neoload.saas.neotys.com/");
LoginPageOne l=new LoginPageOne(driver);
l.login("abc", "xyz");
l.login("admin", "manager");
	}

}
