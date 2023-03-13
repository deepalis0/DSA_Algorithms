public class Cat extends Animal {

    Cat()
    {
        System.out.println("Child class constructor called");
    }

    void makeNoise()
    {
        System.out.println("Cat noise");
    }
    void makeNoise(String sound)
    {
        System.out.println("Cat makes sound: "+sound);
    }

    static void displayMsg()
    {
        System.out.println("Display method from Child Class");
    }


}
