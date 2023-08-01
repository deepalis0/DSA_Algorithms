package MultiThreading;

import java.util.concurrent.CountDownLatch;

public class OrderedPrintingUsingCountDownLatch implements IOrderedPrinting{

    CountDownLatch latch1,latch2;

    OrderedPrintingUsingCountDownLatch()
    {
        this.latch1 = new CountDownLatch(1);
        this.latch2 = new CountDownLatch(1);
    }

    @Override
    public void printFirst() throws InterruptedException {

        System.out.println("First");
        latch1.countDown();
    }

    @Override
    public void printSecond() throws InterruptedException {

        latch1.await();
        System.out.println("Second");
        latch2.countDown();
    }

    @Override
    public void printThird() throws InterruptedException {
      latch2.await();
        System.out.println("Third");
    }
}
