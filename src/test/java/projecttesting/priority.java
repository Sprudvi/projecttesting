package projecttesting;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=3)
	public void m5()
	{
		System.out.println("in m5()");
		
	}
///disabling the test case
		@Test(priority=2,enabled=false)
		public void m6()
		{
			System.out.println("in m6()");
			
		}
		@Test(priority=1,groups="group1")
		public void m31()
		{
			System.out.println("in m31()");
		}
		//we can create many groups and priority
		@Test(priority=2,groups="groups1")
		public void m32()
		{
			System.out.println("in m32()");
		}
}
