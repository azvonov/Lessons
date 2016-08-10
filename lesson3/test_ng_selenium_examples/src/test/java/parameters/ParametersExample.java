package parameters;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    @Parameters({"browser","OS"})
    @Test
    public void parameterstestExample(@Optional String browser,@Optional String OS) throws Exception {
        System.out.println("parameterstestExample - browser recieved - " + browser + " " + OS);
        WebDriver driver = WebDriverFactory.getDriver(browser);
    }
}
