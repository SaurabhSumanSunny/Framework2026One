import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://cloudconvert.com/pdf-converter");
WebElement u= driver.findElement(By.xpath("//button[@type='button']/i/.."));
u.click();
u.sendKeys("D:\\Harsh\\Final Skoda Kylaq Full Brochure Jan 19");
	}

}
