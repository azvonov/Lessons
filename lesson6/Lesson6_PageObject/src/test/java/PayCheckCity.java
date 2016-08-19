import org.testng.Assert;
import org.testng.annotations.Test;

public class PayCheckCity extends BaseTest {


    @Test
    public void pageObjectShowCase() throws Exception {
        String expectedResult = "$160.97";
        SalaryPage salaryPage = new SalaryPage(driver);
        ResultPage resultPage = salaryPage.open()
                .setCalcDate("08/31/2016")
                .setState("California")
                .setGrossPay("10000")
                .clickCalculateButton();
        String actualResult = resultPage.getNetPay();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
