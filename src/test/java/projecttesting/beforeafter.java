package projecttesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeafter 
{
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@BeforeGroups
	public void beforegroup()
	{
		System.out.println("beforegroup");
	}
	@Test
	@AfterGroups
	public void aftergroup()
	{
		System.out.println("aftergroup");
	}
	
	

	
}
