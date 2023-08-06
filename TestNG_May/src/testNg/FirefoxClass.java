package testNg;

import org.testng.annotations.Test;

public class FirefoxClass {
	@Test
	public void test111()
	{
		System.out.println("test111");
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	}
	@Test
	public void test222()
	{
		System.out.println("test222");
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	}
	@Test
	public void test333()
	{
		System.out.println("test333");
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	}
}
