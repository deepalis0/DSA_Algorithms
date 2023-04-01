public class Dog extends Animal
{

    Dog()
    {
        System.out.println("Child class constructor called- Dog");

    }

    private boolean isServiceDog;

    Dog(String name1, String breed1,boolean isServiceDog)
    {
        super(name1,breed1);//call to parent constructor
        this.isServiceDog = isServiceDog;
    }

    void makeNoise()//overriding - runtime polymorphism
    {
        super.makeNoise();
        System.out.println("Dog noise");

    }

    void makeNoise(String sound)//overloading - compile time polymorphism
    {
        System.out.println("Dog makes sound: "+sound);
    }

    public void fetch() {
       System.out.println(getName() + " is fetching the ball!");
      }

    public void sit() {
        System.out.println(getName() + " is sitting.");
    }



static void displayMsg()
    {
        System.out.println("Display method from Child Class");
    }

}
