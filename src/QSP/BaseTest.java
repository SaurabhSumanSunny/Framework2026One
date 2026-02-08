package QSP;

import org.testng.Reporter;
import org.testng.annotations.*;

public class BaseTest {
@BeforeSuite
public void m1()
{
	Reporter.log("Before Suite",true);
}
@AfterSuite
public void m2()
{
	Reporter.log("After Suite", true);
}
@BeforeTest
public void m3()
{
	Reporter.log("Before Test",true);
}
@AfterTest
public void m4()
{
	Reporter.log("After Test",true);
}
@BeforeClass
public void m5()
{
	Reporter.log("Before Class",true);
}
@AfterClass
public void m6()
{
	Reporter.log("After Class",true);
}
@BeforeMethod
public void m7()
{
	Reporter.log("Before Method",true);
}
@AfterMethod
public void m8()
{
	Reporter.log("After Method",true);
}
}
