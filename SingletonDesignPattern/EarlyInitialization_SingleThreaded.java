package SingletonDesignPattern;

import javax.management.InstanceAlreadyExistsException;

class Singleton
{

     private static final Singleton INSTANCE = new Singleton();//at class load time
    //you cannot take any runtime parameters

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
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
public  class EarlyInitialization_SingleThreaded //Eager Initialization
{
   public static void main(String[] args)
   {
       Singleton INSTANCE = Singleton.getInstance();
       INSTANCE.setValue(12);
       System.out.println(INSTANCE.getValue());


   }


}
