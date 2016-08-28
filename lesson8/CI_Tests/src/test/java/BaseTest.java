import config.ApplicationConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import ru.qatools.properties.PropertyLoader;
import webdriver.MyWebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    private static final ApplicationConfig applicationConfig = PropertyLoader.newInstance()
            .populate(ApplicationConfig.class);

    @Parameters({"browser","isGrid"})
    @BeforeTest(alwaysRun = true)
    public void setUp(@Optional String browser,@Optional Boolean isGrid) throws Exception {
        if(isGrid==null){
            driver = MyWebDriverFactory.getDriver(browser);
        }
        else {
            driver = MyWebDriverFactory.getDriver(applicationConfig.getHubUrl(),browser);
        }
        setUpDriver();
    }

    private void setUpDriver() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() throws Exception {
      //  MyWebDriverFactory.dismiss();
        driver.quit();
    }
}
