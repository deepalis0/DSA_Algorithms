package MultiThreading;

public class PrintingNumberSeriesThread implements Runnable{
    PrintingNumberSeries printingNumberSeries;
    String method;

    PrintingNumberSeriesThread(PrintingNumberSeries printingNumberSeries,String method)
    {
        this.method = method;
        this.printingNumberSeries = printingNumberSeries;
    }
    @Override
    public void run() {
        if ("zero".equals(method)) {
            try {
                printingNumberSeries.PrintZero();
            }
            catch (Exception e) {
            }
        }
        else if ("even".equals(method)) {
            try {
                printingNumberSeries.PrintEven();
            }
            catch (Exception e) {
            }
        }
        else if ("odd".equals(method)) {
            try {
                printingNumberSeries.PrintOdd();
            }
            catch (Exception e) {
            }
        }

    }
}
