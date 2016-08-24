package blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralInformationBlock {

    @FindBy(id="generalInformation.grossPayAmount")
    private WebElement grossPay;

    public GeneralInformationBlock setGrossPay(String grossPay) {
        this.grossPay.clear();
        this.grossPay.sendKeys(grossPay);
        return this;
    }
}
