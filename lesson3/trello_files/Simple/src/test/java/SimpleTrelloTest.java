import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SimpleTrelloTest {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.ie.driver","C:\\SeleniumCourses\\lib\\IEDriverServer32.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test()
    public void dragAndDrop() throws IOException {

        String expectedResult = "Advanced";
        driver.get("https://trello.com/login");

        driver.findElement(By.id("user")).sendKeys("testtesttest@mail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");

        driver.findElement(By.id("login")).click();

        driver.findElement(By.xpath("//span[@title='Welcome Board' and @class='board-tile-details-name']"))
                .click();
        WebElement source = driver.findElement(By.xpath("//a[contains(text(),'Drop me')]"));
        WebElement target = driver.findElement(By.xpath("//textarea[contains(text(),'Advanced')]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        WebElement targetElementColumn = driver
                .findElement(By.xpath("//a[contains(text(),'Drop me')]/ancestor::div[@class='list js-list-content']//textarea"));
        Assert.assertEquals(expectedResult,targetElementColumn.getText());

        source = driver.findElement(By.xpath("//a[contains(text(),'Drop me')]"));
        WebElement rollBack = driver.findElement(By.xpath("//textarea[contains(text(),'Basics')]"));
        actions.dragAndDrop(source, rollBack).perform();
    }

    @After
    public void tearDown() throws Exception {
        driver.findElement(By.xpath(".//*[@id='header']/div[4]/a[2]/span[1]/span[1]")).click();
        driver.findElement(By.cssSelector(".js-logout")).click();
        driver.quit();
    }
}
