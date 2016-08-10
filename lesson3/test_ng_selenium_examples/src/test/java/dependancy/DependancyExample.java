package dependancy;


import org.testng.annotations.Test;

public class DependancyExample {

    private Integer counter = 0;

    @Test(dependsOnGroups = "p1")
    public void test1() throws Exception {
        System.out.println(++counter + " - test DependantOnGroup P1");
    }
    @Test(groups = {"p1"})
    public void test2() throws Exception {
        System.out.println(++counter + " - test2 P1");
    }
    @Test(dependsOnMethods = "test1")
    public void test3() throws Exception {
        System.out.println(++counter + " - test dependsOnMethod test2");
    }
}
