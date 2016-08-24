package blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(id = "heading_pane")
public class DateAndStateBlock {
    @FindBy(id="calcDate")
    private WebElement calcDate;
    @FindBy(id="state")
    private WebElement state;

    public DateAndStateBlock setCalcDate(String date) {
        this.calcDate.clear();
        this.calcDate.sendKeys(date);
        return this;
    }


    public DateAndStateBlock setState(String state) {
        this.state.clear();
        this.state.sendKeys(state);
        return this;
    }
}
