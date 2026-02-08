package QSP;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String key="webdriver.chrome.driver";
String value="./driver/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();
driver.get("https://www.actitime.com/login-to-product");
TakesScreenshot t=(TakesScreenshot)driver;
File srcFile=t.getScreenshotAs(OutputType.FILE);
File destFile=new File("d://page1.png");
FileUtils.copyFile(srcFile,destFile);
	
	}

}
