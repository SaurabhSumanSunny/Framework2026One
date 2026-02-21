package FrameOne;

import org.testng.Reporter;
import org.testng.annotations.Test;

import FirstP.LoginPage;

public class VerifyLoginPage extends BaseTest{
	@Test
	public void testLoginPage() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		l.verifyTitle("Sign in to GitHub · GitHub");
		Thread.sleep(2000);
	}

}
