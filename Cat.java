public class Cat extends Animal {

    Cat()
    {
        System.out.println("Child class constructor called- Cat");
    }


    Cat(String name, String breed)
    {
        super(name,breed);
        System.out.println("Child class constructor called");
    }

//    void makeNoise()
//    {
//        System.out.println("Cat noise");
//    }
    void makeNoise(String sound)
    {
        System.out.println("Cat makes sound: "+sound);
    }

    public void meow() {
        System.out.println("Meow meow!");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching the furniture!");
    }
    static void displayMsg()
    {
        System.out.println("Display method from Child Class");
    }


}
