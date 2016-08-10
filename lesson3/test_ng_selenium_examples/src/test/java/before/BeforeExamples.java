package before;

import org.testng.annotations.*;

public class BeforeExamples {
    private Integer counter = 0;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        System.out.println(++counter + " - BeforeMethod");
    }

    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println(++counter + " - BeforeClass");
    }

    @BeforeGroups
    public void beforeGroups() throws Exception {
        System.out.println(++counter + " - BeforeGroups");
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
        System.out.println(++counter + " - BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() throws Exception {
        System.out.println(++counter + " - BeforeTest");
    }

    @Test
    public void testMethod (){
        System.out.println(++counter + " - TestMethod");
    }
}
