package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyz {

	@Test(retryAnalyzer = testNg.RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test(retryAnalyzer = testNg.RetryAnalyzer.class)
	public void Test2()
	{
		Assert.assertEquals(true, true);
	}
}