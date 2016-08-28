package webdriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.stqa.selenium.factory.WebDriverFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;


public class MyWebDriverFactory {

    private static final Logger LOG = Logger.getLogger("MyWebDriverFactory");

    public static WebDriver getDriver(String browser) throws IOException {
        if (browser == null)
            browser = "UNKNOWN BROWSER INPUT";
        switch (browser.toUpperCase()) {
            case "FIREFOX":
                return initBrowser(BrowserService.prepareFirefox());
            case "CHROME":
                return initBrowser(BrowserService.prepareChrome());
            case "HTMLUNIT":
                return initBrowser(BrowserService.prepareHtmlUnit());
            default:
                LOG.info("MyWebDriverFactory: browser unknown. Default option - Firefox");
                return initBrowser(BrowserService.prepareFirefox());
        }
    }

    public static WebDriver getDriver(String hubUrl, String browser) throws IOException {
        if (browser == null)
            getDriver(browser);
        switch (browser.toUpperCase()) {
            case "FIREFOX":
                return initBrowser(hubUrl, BrowserService.prepareFirefox());
            case "CHROME":
                return initBrowser(hubUrl, BrowserService.prepareChrome());
            case "HTMLUNIT":
                return initBrowser(hubUrl, BrowserService.prepareHtmlUnit());
            default:
                LOG.info("MyWebDriverFactory: browser unknown. Default option - Firefox");
                return initBrowser(hubUrl, BrowserService.prepareFirefox());
        }
    }

    private static WebDriver initBrowser(String hubUrl, Capabilities capabilities) throws MalformedURLException {
       // return new RemoteWebDriver(new URL(hubUrl), capabilities);
       return WebDriverFactory.getDriver(hubUrl, capabilities);
    }

    private static WebDriver initBrowser(Capabilities capabilities) {
        return WebDriverFactory.getDriver(capabilities);
    }

    public static void dismiss() {
        WebDriverFactory.dismissAll();
    }
}
