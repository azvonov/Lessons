package blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsBlock {
    @FindBy(id="calculate")
    private WebElement calculateButton;

    public void clickCalculateButton() {
        calculateButton.click();
    }
}
