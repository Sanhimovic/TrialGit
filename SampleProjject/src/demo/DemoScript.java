package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoScript 
{
	@Test
	public void test()
	{
		Reporter.log("1", true);
	}
}
