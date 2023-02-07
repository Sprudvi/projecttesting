package projecttesting;

import org.testng.annotations.Test;

public class example {
	@Test(description="test 1 method")
	public void m1()
	{
		System.out.println("in m1()");
		
	}
	@Test(description="test 2 method")
	public void m2()
	{
		System.out.println("in m2()");
		
	}
	@Test(priority=2)
	public void m3()
	{
		System.out.println("in m3()");
		
	}
	@Test(priority=1)
	public void m4()
	{
		System.out.println("in m4()");
		
	}

}
