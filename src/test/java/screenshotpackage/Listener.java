package screenshotpackage;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Resources.HomePage;

public class Listener implements ITestListener{
	
	HomePage page=new HomePage();

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Case Successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		// TODO Auto-generated method stub
		try {
			page.getScreenshots(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Test Case failed"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
