package QSP;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoB extends BaseTest {
@DataProvider(name="getData")
public String[][] getData()
{
	String[][] data=new String[2][2];
	data[0][0]="user A";
	data[0][1]="A1";
	data[1][0]="user B";
	data[1][1]="B1";
	return data;
}
@Test(dataProvider="getData")
public void testC(String un, String pw)
{
	Reporter.log("Create UN"+un+"with password"+pw);
}
}
