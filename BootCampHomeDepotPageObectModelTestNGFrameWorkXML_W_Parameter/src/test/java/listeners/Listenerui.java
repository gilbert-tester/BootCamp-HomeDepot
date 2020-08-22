package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Websites.PageObectModelFrameWork.Base;



public class Listenerui extends Base implements ITestListener{
	public void onStart(ITestContext context) {
		System.out.println("Test is started           "+context);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed             "+result);

	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed              "+result);

	}
	public void onTestStart(ITestResult result) {
		System.out.println("This is on teststart         "+result);
	}
}