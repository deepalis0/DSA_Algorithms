package MultiThreading;
import java.util.concurrent.Semaphore;

public class PrintingNumberSeries {
    int n;
    Semaphore zero,even,odd;
    public PrintingNumberSeries(int n) {
        this.n = n;
        zero = new Semaphore(1);
        even = new Semaphore(0);
        odd  = new Semaphore(0);
    }


    public void PrintZero() throws InterruptedException{

            for(int i=0;i<=n;i++) {
                zero.acquire();
                System.out.print(0 + " ");
                (i%2==0 ? odd : even).release();
            }

    }

    public void PrintOdd() throws InterruptedException{

            for (int i = 1; i <= n; i += 2) {
                odd.acquire();
                System.out.print(i + " ");
                zero.release();
            }


    }

    public void PrintEven() throws InterruptedException{

            for (int i = 2; i <= n; i += 2) {
                even.acquire();
                System.out.print(i + " ");
                zero.release();
            }

    }
}
