package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RtryListen implements IRetryAnalyzer {
	public  int retry =0;
	public static final int maxRetry=3;

	public boolean retry(ITestResult result) {
		if (retry< maxRetry) {
			retry++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
