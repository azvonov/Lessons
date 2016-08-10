package dataProvider;


import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "demoDataProvider")
    public static Object[][] salaryData() {

        String login = "PiotrGaidur";
        String password  = "qwerty";

        String login1 = "JohnSmith";
        String password2  = "1234";

        return new Object[][] {{login,password}
                ,{login1,password2}};
    }
}
