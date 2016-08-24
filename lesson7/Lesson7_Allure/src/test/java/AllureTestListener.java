import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;

public class AllureTestListener extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] makeScreenShot(String testName, WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public void onTestFailure(ITestResult result) {
        String testName = result.getName().concat(".png");
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).driver;
        makeScreenShot(testName, driver);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
