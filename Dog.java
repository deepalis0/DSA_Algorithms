public class Dog extends Animal
{

    Dog()
    {
        System.out.println("Parent class constructor called");

    }

    boolean isServiceDog;

    Dog(String name, String breed,boolean isServiceDog)
    {
        super(name,breed);
        this.isServiceDog = isServiceDog;
    }

    void makeNoise()
    {
        System.out.println("Dog noise");
    }

    void makeNoise(String sound)
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
