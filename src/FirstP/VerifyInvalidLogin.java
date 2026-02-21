package FirstP;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class VerifyInvalidLogin extends BaseTest{
@Test
public void testVerifyLogin()
{
	SoftAssert s=new SoftAssert();
	LoginPage l=new LoginPage(driver);
	int rc=Excel.getRowCount("D:\\Book1.xlsx","Sheet1");
	for(int i=0;i<=rc;i++)
	{
		String un=Excel.getCellValue("D:\\Book1.xlsx","Sheet1",i,0);
		String pw=Excel.getCellValue("D:\\Book1.xlsx","Sheet1",i,1);
		//l.setUserName(un);
		//l.setPassword(pw);
		//l.clickLogin();
		//l.verifyErrIsPresent(s);
	}
	s.assertAll();
}
}
