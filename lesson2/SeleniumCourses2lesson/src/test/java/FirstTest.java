import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    public void testName() throws Exception {
        String expectedResult = "927";
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.avtocivilka.org.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        WebElement carType = driver.findElement(By.id("car"));
        new Select(carType).selectByVisibleText("Легковые 2001-3000 см³");

        new Select(driver.findElement(By.id("pay"))).selectByVisibleText("200 000 грн");
        WebElement result = driver.findElement(By.id("price-office-dis"));
        (new WebDriverWait(driver,10))
                .until(ExpectedConditions.textToBePresentInElement(result,expectedResult));
        String actualResult = result.getText();
        Assert.assertEquals(actualResult,expectedResult);
        driver.quit();
    }
}
