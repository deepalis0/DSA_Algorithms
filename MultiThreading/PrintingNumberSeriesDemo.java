package MultiThreading;

public class PrintingNumberSeriesDemo {
    public static void main(String[] args) {
        PrintingNumberSeries printingNumberSeries = new PrintingNumberSeries(5);
//        PrintingNumberSeriesThread t1 = new PrintingNumberSeriesThread(printingNumberSeries,"zero");
//        PrintingNumberSeriesThread t2 = new PrintingNumberSeriesThread(printingNumberSeries,"even");
//        PrintingNumberSeriesThread t3 = new PrintingNumberSeriesThread(printingNumberSeries,"odd");
//        Thread thread1 = new Thread(t1);
//        Thread thread2 = new Thread(t2);
//        Thread thread3 = new Thread(t3);
//        thread3.start();
//        thread1.start();
//        thread2.start();
        Thread t1 = new Thread( () -> {
            try {
                printingNumberSeries.PrintZero();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );
        Thread t2 = new Thread( () -> {
            try {
                printingNumberSeries.PrintOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );
        Thread t3 = new Thread( () -> {
            try {
                printingNumberSeries.PrintEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );
        t1.start();
        t2.start();
        t3.start();

    }
}
