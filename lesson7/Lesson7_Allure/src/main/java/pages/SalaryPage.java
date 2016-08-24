package pages;

import blocks.ButtonsBlock;
import blocks.DateAndStateBlock;
import blocks.GeneralInformationBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class SalaryPage extends BasePage {

    private static final String URL = "http://www.paycheckcity.com/calculator/salary/";

    private DateAndStateBlock dateAndStateBlock;
    private GeneralInformationBlock generalInformationBlock;
    private ButtonsBlock buttonsBlock;

    public SalaryPage(WebDriver driver) {
        super(driver);
        dateAndStateBlock = PageFactory.initElements(driver, DateAndStateBlock.class);
        generalInformationBlock = PageFactory.initElements(driver, GeneralInformationBlock.class);
        buttonsBlock = PageFactory.initElements(driver, ButtonsBlock.class);
    }
    @Step
    public SalaryPage setCalcDate(String date) {
        dateAndStateBlock.setCalcDate(date);
        return this;
    }
    @Step
    public SalaryPage setState(String state) {
        dateAndStateBlock.setState(state);
        return this;
    }
    @Step
    public SalaryPage open() {
        driver.get(URL);
        return this;
    }
    @Step
    public SalaryPage setGrossPay(String grossPay) {
        generalInformationBlock.setGrossPay(grossPay);
        return this;
    }
    @Step
    public ResultPage clickCalculateButton() {
        buttonsBlock.clickCalculateButton();
        return new ResultPage(driver);
    }

}
