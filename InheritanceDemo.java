public class InheritanceDemo {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.makeNoise();
        System.out.println("---------------------------------");

        Cat cat = new Cat("Kitty","PersianCat");
        cat.makeNoise("Purr!"); //Cat makes sound: Purr!
        cat.scratch();
        System.out.println("---------------------------------");

        Dog dog = new Dog("Pluto","Labrador",true);
        dog.makeNoise("Bark!");
        dog.fetch();

    /************************************************************   Interesting things to Note!   ***************************************************************************/
       Animal obj1 = new Cat();
       //obj1.scratch(); //cannot access

       Animal obj2 = new Dog();
       //obj2.fetch(); //cannot access

       Cat cat1 = (Cat) new Animal();
       cat1.scratch();

    }
}
