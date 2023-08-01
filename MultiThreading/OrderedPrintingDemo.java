package MultiThreading;

public class OrderedPrintingDemo {
    public static void main(String[] args) throws InterruptedException{
        OrderedPrinting orderedPrinting = new OrderedPrinting();
        OrderedPrintingUsingCountDownLatch usingCountDownLatch = new OrderedPrintingUsingCountDownLatch();
        OrderedPrintingThread t1 = new OrderedPrintingThread("first",orderedPrinting);
        OrderedPrintingThread t2 = new OrderedPrintingThread("second",orderedPrinting);
        OrderedPrintingThread t3 = new OrderedPrintingThread("third",orderedPrinting);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread3.start();
        thread1.start();
        thread2.start();

        //calling thread which is the main thread will wait until the reference thread is exited, here the referenced
        //thread is t1 , t2 and t3 respectively on lines 21, 22 and 23
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("All OrderedPrinting Threads died!");
        System.out.println("Starting implementation of CountDownLatch");

        t1 = new OrderedPrintingThread("first",usingCountDownLatch);
        t2 = new OrderedPrintingThread("second",usingCountDownLatch);
        t3 = new OrderedPrintingThread("third",usingCountDownLatch);
        thread1 = new Thread(t1);
        thread2 = new Thread(t2);
        thread3 = new Thread(t3);
        thread3.start();
        thread1.start();
        thread2.start();





    }
}
