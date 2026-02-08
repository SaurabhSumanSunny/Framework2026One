import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.yatra.com");

driver.findElement(By.xpath("//img[@alt='cross']")).click();

WebElement a=driver.findElement(By.xpath("//span[text()='Departure Date']/../..//div[2]/div"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", a);
driver.findElement(By.xpath("//span[text()='February 2026']//ancestor::div[@class='react-datepicker__month-container']//span[text()='09']")).click();

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
String date = now.format(formatter);
System.out.println("Formatted Date: " + date);

DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
LocalDateTime now1 = LocalDateTime.now();
String date1 = now1.format(formatter1);
System.out.println("Formatted Date1: " + date1);

Thread.sleep(2000);
JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,500)");

Thread.sleep(2000);
JavascriptExecutor js2 = (JavascriptExecutor) driver;
js2.executeScript("window.scrollBy(0,500)");

System.out.println("Formatted Date1: " + date1);
	}

}


