import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://neoload.saas.neotys.com/");
LoginPage l=new LoginPage(driver);
l.login("admin","manager");
	}

}
