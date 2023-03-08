package SingletonDesignPattern;

public class EnumImpl {
    public static void main(String[] args) {


        // Create two threads that will each try to access the Singleton instance
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                SingletonEnum.INSTANCE.setValue(123);

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {

                System.out.println(  SingletonEnum.INSTANCE.getValue());


            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

enum SingletonEnum
{
    INSTANCE ; //only name of instance is serialized


//    private SingletonEnum()
//    {}

    // enums are inherently serializable (but what good is that?)
    // reflection not a problem, guaranteed 1 instance in JVM

    // field values not serialized!

    private int value = 100;
    public void setValue(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

}
