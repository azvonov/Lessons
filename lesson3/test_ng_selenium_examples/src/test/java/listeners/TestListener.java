package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("Failure");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println("Skipped");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("Success");
    }

}
