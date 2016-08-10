package multithreading;

import org.testng.annotations.Test;

public class BareMultithreadExample {


    @Test(threadPoolSize = 3, invocationCount = 3, timeOut = 10000)
    public void testMultithreads() throws Exception {
        System.out.println("testMultithreads - ThreadID "
                + Thread.currentThread().getId());
    }

    @Test
    public void standartTest1() throws Exception {
        System.out.println("standartTest1 - ThreadID "
                + Thread.currentThread().getId());
    }
    @Test
    public void standartTest2() throws Exception {
        System.out.println("standartTest2 - ThreadID "
                + Thread.currentThread().getId());
    }
}
