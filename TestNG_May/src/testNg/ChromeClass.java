package testNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Ignore
@Listeners(ListenersTestNG.class)
public class ChromeClass  {

	@Test(enabled = false)
	public void test11()
	{
		System.out.println("test11");
		//System.out.println("The thread ID for chrome is "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test22()
	{
		//Assert.assertTrue(false);
		System.out.println("test22");
		//System.out.println("The thread ID for chrome is "+ Thread.currentThread().getId());
	}
	@Test
	public void test33()
	{
		//Assert.assertTrue(false);
		//System.out.println("test33");
		//System.out.println("The thread ID for chrome is "+ Thread.currentThread().getId());
	}


}
