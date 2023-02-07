package projecttesting;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testsuite
{
	@Test
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("in beforesuite()");
		
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("in Aftersuite()");
		
	}
	

}
