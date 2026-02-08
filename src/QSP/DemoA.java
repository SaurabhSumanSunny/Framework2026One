package QSP;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest{
@Test(priority=2)
public void testA()
{
	Reporter.log("Test A", true);
}
@Test(priority=1,invocationCount=2)
public void testB()
{
	Reporter.log("Test B", true);
}

}
