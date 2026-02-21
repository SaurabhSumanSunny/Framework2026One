package FirstP;

import org.testng.annotations.Test;

public class VerifyLoginPage extends BaseTest {
@Test
public void testVerifyLoginPage()
{
	LoginPage l=new LoginPage(driver);
	l.verifyTitle("Login to your actiTIME account");
	
}
}
