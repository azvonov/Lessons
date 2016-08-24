import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ResultPage;
import pages.SalaryPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;

public class PayCheckCity extends BaseTest {

    @TestCaseId("1794")
    @Features("SalaryCalculator")
    @Stories("CalculateSalary")
    @Test
    public void pageObjectShowCase() throws Exception {
        String expectedResult = "$160.97";
        SalaryPage salaryPage = new SalaryPage(driver);
        Assert.assertEquals(1,1);
        ResultPage resultPage = salaryPage.open()
                .setCalcDate("08/31/2016")
                .setState("California")
                .setGrossPay("10000")
                .clickCalculateButton();
        String actualResult = resultPage.getNetPay();
        Assert.assertEquals(actualResult,expectedResult);
    }
    @TestCaseId("1795")
    @Features("HourlyCalculator")
    @Stories("CalculateSalary")
    @Test
    public void testName() throws Exception {
    }
}
