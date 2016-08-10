package priorities;

import org.testng.annotations.Test;

public class PrioritizedTest {
    private Integer counter = 0;

    @Test(priority = 2)
    public void testPriority2() throws Exception {
        System.out.println(++counter + " - testP2");
    }
    @Test(priority = 1)
    public void TestPriority1() throws Exception {
        System.out.println(++counter + " - testP1");
    }
    @Test(priority = 1)
    public void anotherTestPriority1() throws Exception {
        System.out.println(++counter + " - anotherTestPriority1");
    }
}
