package dataProvider;

import org.testng.annotations.Test;

public class TestClass {

    @Test(dataProvider = "demoDataProvider",
            dataProviderClass = DataProviderClass.class)
    public void testDataProvider(String login, String password) throws Exception {
        LoginEngine loginEngine = new LoginEngine();
        loginEngine.loginUser(login,password);
    }
}
