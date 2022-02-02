package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener implements ITestListener {

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed===AKAASH");
		System.out.println("Failed Methods :  "+result.getName());
		System.out.println(result.getStatus());
		System.out.println("a :   "+result.getThrowable().getMessage());
	}
}
