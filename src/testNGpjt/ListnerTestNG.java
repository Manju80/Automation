package testNGpjt;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.IReporter;


public class ListnerTestNG implements ITestListener{

	@Override
	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext Result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

	//when test case gets failed,this method is called
	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the test case failed:"+Result.getName());
		//Reporter.log("onTestFailure", true);
		
	}

	//when test case gets skipped, this method is called
	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the test case skipped:"+Result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println("The test started and details are:"+Result.getName());
		
	}

	//When test get passed, this method is called
	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the test case passed:"+Result.getName());
		
	}

}
