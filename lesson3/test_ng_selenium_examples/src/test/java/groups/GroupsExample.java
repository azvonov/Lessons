package groups;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsExample {
    private Integer counter = 0;

    @BeforeTest(groups = "p2",alwaysRun = true)
    public void beforeTest() throws Exception {
        System.out.println(++counter + " - BeforeTest");
    }

    @Test(groups = {"regression", "p1"})
    public void test1() throws Exception {
        System.out.println(++counter + " - testP1");
    }

    @Test(groups = {"regression", "p2"})
    public void test2() throws Exception {
        System.out.println(++counter + " - testP2");
    }
}
