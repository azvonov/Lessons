package webdriver;

import config.ApplicationConfig;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.qatools.properties.PropertyLoader;

public class BrowserService {
    private static final ApplicationConfig applicationConfig = PropertyLoader.newInstance()
            .populate(ApplicationConfig.class);

    public static String getPathToGecko() {
        String environment = applicationConfig.getEnvironment().toUpperCase();
        System.out.println(environment);
        if (environment.equals("LINUX")) {
            return "/home/azvonov/drivers/geckodriver";
        } else if (environment.equals("WINDOWS")) {
            return "C:\\SeleniumCourses\\lib\\geckodriver.exe";
        } else {
            throw new WebDriverException("Can't start webdriver. Unknown environment recieved.");
        }
    }

    public static DesiredCapabilities prepareFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumCourses\\lib\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", false);
        capabilities.setBrowserName("firefox");
        return capabilities;
    }

    public static DesiredCapabilities prepareChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCourses\\lib\\chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        return capabilities;
    }

    public static Capabilities prepareHtmlUnit() {
        return  DesiredCapabilities.htmlUnitWithJs();
    }
}
