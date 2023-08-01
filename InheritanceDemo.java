public class InheritanceDemo {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.makeNoise();
//        Animal animal = new Animal();
//        animal.makeNoise();
//        System.out.println("---------------------------------");
//
//
//
//    /************************************************************   Interesting things to Note!   ***************************************************************************/
//       Animal obj1 = new Cat();
//      // obj1.scratch(); //cannot access
//
//
//       Animal obj2 = new Dog();
//      // obj2.fetch(); //cannot access
//
//       // compile time error
//       Cat cat1 = (Cat) new Animal();
//       cat1.scratch();

      // explicitly downcasting
       // Cat cat1 = (Cat) obj1;
        //cat1.scratch();

    }
}
