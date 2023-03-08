package SingletonDesignPattern;

class SingletonL
{

    private static SingletonL INSTANCE = null;
    private SingletonL()
    {

    }

    public static SingletonL getINSTANCE()
    {
        if(INSTANCE==null)
        {
            INSTANCE = new SingletonL();
        }
        return INSTANCE;

    }
    private int value;

    public void setValue(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

}
public class LazyInitialization_SingleThreaded {

    public static void main(String[] args)
    {
        SingletonL INSTANCE = SingletonL.getINSTANCE();
        INSTANCE.setValue(122);
        System.out.println(INSTANCE.getValue());


    }

}
