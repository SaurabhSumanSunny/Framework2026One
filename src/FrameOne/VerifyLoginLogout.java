package FrameOne;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class VerifyLoginLogout extends BaseTest{
@Test
public void testVerifyLoginLogout() throws InterruptedException, EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("D://Book2.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String user=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
	Thread.sleep(3000);
	String pwd=wb.getSheet("Sheet1").getRow(0).getCell(1).toString();
	Thread.sleep(3000);
	LogInPage l=new LogInPage(driver);
	l.setUsername(user);
	l.setPassword(pwd);
	l.clickLogin();
	Thread.sleep(3000);
	HomePage h=new HomePage(driver);
	h.verifyTitle("GitHub");
	h.clickMenu();
	h.clickLogout();
	
}
}
