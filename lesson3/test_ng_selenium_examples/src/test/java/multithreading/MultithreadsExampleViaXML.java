package multithreading;

import org.testng.annotations.Test;

public class MultithreadsExampleViaXML {

    @Test
    public void test1() throws Exception {
        System.out.println("ThreadID "
                + Thread.currentThread().getId());
    }
    @Test
    public void test2() throws Exception {
        System.out.println("ThreadID "
                + Thread.currentThread().getId());
    }
    @Test
    public void test3() throws Exception {
        System.out.println("ThreadID "
                + Thread.currentThread().getId());
    }
}
