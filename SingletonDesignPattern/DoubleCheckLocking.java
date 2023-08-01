package SingletonDesignPattern;

import java.io.Serializable;

class SingletonM implements Serializable
{
    private static  SingletonM INSTANCE = null;

    private SingletonM()
    {

    }

    //this is Multi-thread safe, but we need to make the INSTANCE volatile as well - only when you make method synchronized
    public static  SingletonM getINSTANCE()
    {
         if(INSTANCE ==null)
         {
               synchronized(SingletonM.class) //acquire lock , no need to make INSTANCE volatile
             {
                 if(INSTANCE == null)
                 {
                     INSTANCE = new SingletonM();
                 }
             }

         }

        return INSTANCE;

    }


    private int value = 100;

    public void setValue(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }


    protected Object readResolve() //this implementation is now safe from Serialization as well
    {
        return INSTANCE;
    }
}
public class DoubleCheckLocking {

    public static void main(String[] args) {
        // Create two threads that will each try to access the Singleton instance
        Thread thread1 = new Thread(() -> {
            SingletonM singleton = SingletonM.getINSTANCE();
            singleton.setValue(123);
           System.out.println("Thread 1 - Singleton hash code: " + singleton.hashCode());
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                SingletonM singleton = SingletonM.getINSTANCE();
                System.out.println(singleton.getValue());
                System.out.println("Thread 2 - Singleton hash code: " + singleton.hashCode());
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }

}
