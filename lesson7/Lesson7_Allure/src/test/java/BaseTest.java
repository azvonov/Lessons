import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import ru.stqa.selenium.factory.WebDriverFactory;
import ru.stqa.selenium.factory.WebDriverFactoryMode;
import webDriver.MyWebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional String browser) throws Exception {
   //    Remove comment to use custom WebDriverFactory
   //    driver = MyWebDriverFactory.getDriver(browser);

        WebDriverFactory.setMode(WebDriverFactoryMode.THREADLOCAL_SINGLETON);
        driver = WebDriverFactory.getDriver(MyWebDriverFactory.prepareFirefox());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        WebDriverFactory.dismissAll();
    }
}
