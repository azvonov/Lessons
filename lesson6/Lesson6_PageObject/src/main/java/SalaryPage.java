import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalaryPage extends BasePage {

    private static final String URL = "http://www.paycheckcity.com/calculator/salary/";

    @FindBy(id="calcDate")
    WebElement calcDate;
    @FindBy(id="state")
    WebElement state;
    @FindBy(id="generalInformation.grossPayAmount")
    WebElement grossPay;
    @FindBy(id="calculate")
    WebElement calculateButton;

    public SalaryPage(WebDriver driver) {
       super(driver);
    }

    public SalaryPage open() {
        driver.get(URL);
        return this;
    }

    public SalaryPage setCalcDate(String date) {
        this.calcDate.clear();
        this.calcDate.sendKeys(date);
        return this;
    }


    public SalaryPage setState(String state) {
        this.state.clear();
        this.state.sendKeys(state);
        return this;
    }

    public SalaryPage setGrossPay(String grossPay) {
        this.grossPay.clear();
        this.grossPay.sendKeys(grossPay);
        return this;
    }
    public ResultPage clickCalculateButton() {
        calculateButton.click();
        return new ResultPage(driver);
    }
}
