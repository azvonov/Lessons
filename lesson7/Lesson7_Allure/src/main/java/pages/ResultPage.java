package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultPage extends BasePage {

    private final String NET_PAY_RESULT_LOCATOR
            = "//div[@id='dijit_TitlePane_1_pane']//span[@class='resultData']";

    @FindBy(xpath = NET_PAY_RESULT_LOCATOR)
    private WebElement netPay;


    public ResultPage(WebDriver driver) {
        super(driver);
        fluentWait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(NET_PAY_RESULT_LOCATOR)));
    }
    @Step
    public String getNetPay() {
        return netPay.getText();
    }
}
