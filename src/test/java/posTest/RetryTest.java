package posTest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryTest {
	
	
	@Test(retryAnalyzer=retry.RtryListen.class)
	public void test1() {
		System.out.println("Testin stated");
		Assert.assertTrue(0>1);
	}
	
	@Test
	public void test2() {
		System.out.println("Testin stated");
	
	}
	
	
	

}
