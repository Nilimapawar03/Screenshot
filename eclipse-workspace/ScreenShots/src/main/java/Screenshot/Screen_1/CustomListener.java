package Screenshot.Screen_1;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener{
	public void onTestStart(ITestResult result) {
		
	}
	public void onTestSuccess(ITestResult result) {
		
	}
public void onTestSkipped(ITestResult result) {
		
	}
public void onTestFailure(ITestResult result) {
	System.out.println("Failed Test Case");
	failed(result.getMethod().getMethodName());
}

	
	
	
}
