public class PolymorphismDemo {

    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.makeNoise();//Generic animal noise
        System.out.println("---------------------------------");

        Cat cat = new Cat();
        cat.makeNoise();// Cat noise --overridden method called
        cat.makeNoise("Purr!"); //Cat makes sound: Purr!
        System.out.println("---------------------------------");

        Animal object = new Cat();
        object.makeNoise();// the child class method is called
        object.displayMsg(); //the base class method is called as it is a call
        //to static method

        cat.displayMsg();


    }
}
