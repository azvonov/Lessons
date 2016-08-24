package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Logger;

public class MyWebDriverFactory {

    private static final Logger LOG = Logger.getLogger("MyWebDriverFactory");

    public static WebDriver getDriver(String browser) {

        if (browser == null)
            browser = "UNKNOWN BROWSER INPUT";
        switch (browser.toUpperCase()) {
            case "FIREFOX":
                return initFirefox();
            case "CHROME":
                return initChrome();
            default:
                LOG.info("MyWebDriverFactory: browser unknown. Default option - Firefox");
                return initFirefox();
        }
    }
    private static WebDriver initFirefox() {
        return new FirefoxDriver(prepareFirefox());
    }

    public static DesiredCapabilities prepareFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumCourses\\lib\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", false);
        return capabilities;
    }

    private static WebDriver initChrome() {
        throw new WebDriverException("Not implemented yet");
    }
}
