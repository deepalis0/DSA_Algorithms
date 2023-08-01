package MultiThreading;

public class OrderedPrinting implements  IOrderedPrinting{
     int count;
    OrderedPrinting()
    {
        this.count = 1;
    }
    public void printFirst ()throws InterruptedException
    {
        synchronized (this)
        {
            System.out.println("First");
            count++;
            this.notifyAll(); //if u take it out of synchronized u gte
            //current thread is not owner -error
        }


    }
    public void printSecond() throws InterruptedException {
        synchronized (this) {
            while (count != 2) {
                this.wait();
            }
            System.out.println("Second");
            count++;
            this.notifyAll();
        }
    }

    public void printThird() throws InterruptedException
    {
        synchronized (this) {
            while (count != 3) {
                this.wait();
            }
            System.out.println("Third");
        }
    }
}
