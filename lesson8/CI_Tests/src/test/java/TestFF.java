import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFF extends BaseTest {

    @Test(threadPoolSize = 2,invocationCount = 2,timeOut = 20000)
    public void testName() throws Exception {
        driver.get("https://github.com/");
        assertEquals(driver.getTitle(),"How people build software · GitHub");
    }
}
