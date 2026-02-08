import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Second {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.google.com/search?q=selenium");
Thread.sleep(15000);
driver.findElement(By.xpath("//div//textarea")).clear();
driver.findElement(By.xpath("//div//textarea")).sendKeys("Selenium");


List<WebElement> allSuggestion=driver.findElements(By.xpath("//ul//li[@data-attrid='AutocompletePrediction']"));
int s= allSuggestion.size();
WebElement l=allSuggestion.get(s-1);
String t=l.getText();
System.out.println(t);
l.click();


	}

}
