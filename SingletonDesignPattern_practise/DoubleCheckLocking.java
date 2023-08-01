package SingletonDesignPattern_practise;

public class DoubleCheckLocking {
    public static void main(String[] args) {
        // Create two threads that will each try to access the Singleton instance
        Thread thread1 = new Thread(new Runnable() {
            public void run() {

               // System.out.println("Thread 1 - Singleton hash code: " + singleton.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {

              //  System.out.println("Thread 2 - Singleton hash code: " + singleton.hashCode());
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
class DatabaseConnection
{


}

