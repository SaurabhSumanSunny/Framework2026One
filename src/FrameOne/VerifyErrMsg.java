package FrameOne;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyErrMsg extends BaseTest{
@Test
public void testVerifyVersion()
{
	SoftAssert s= new SoftAssert();
	LogInPage l=new LogInPage(driver);
	l.setUsername("admin");
	l.setPassword("Manager");
	l.clickLogin();
	l.verifyErrMsgIsPresent(s);
	s.assertAll();
}
}
