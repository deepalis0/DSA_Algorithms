package MultiThreading;

public class OrderedPrintingThread implements Runnable
{
    String method;
    IOrderedPrinting orderedPrinting;

    OrderedPrintingThread(String method,IOrderedPrinting orderedPrinting)
    {
        this.method = method;
        this.orderedPrinting = orderedPrinting;
    }
    public void run()
    {
        try {
            if (this.method.equals("first")) {
                orderedPrinting.printFirst();
            } else if (this.method.equals("second")) {
                orderedPrinting.printSecond();
            }
            else {
                orderedPrinting.printThird();
            }
        }
        catch (InterruptedException ignored)
        {

        }

    }



}
