import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultPage extends BasePage {

    private final String NET_PAY_RESULT_LOCATOR
            = "//div[@id='dijit_TitlePane_1_pane']//span[@class='resultData']";

    @FindBy(xpath = NET_PAY_RESULT_LOCATOR)
    WebElement netPay;

    public ResultPage(WebDriver driver) {
        super(driver);
        fluentWait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(NET_PAY_RESULT_LOCATOR)));
    }

    public String getNetPay() {
        return netPay.getText();
    }
}
