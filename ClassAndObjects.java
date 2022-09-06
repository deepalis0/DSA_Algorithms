import AccessModifier_myPackage.MyClass;

//import AccessModifier_myPackage.MyClass;
public class ClassAndObjects {
// Access Modifiers in Java : https://www.geeksforgeeks.org/access-modifiers-java/
// default public private protected

    public static void main(String[] args)
    {
       Dog dog = new Dog();
       dog.breed = "Labrodor";

       System.out.println(dog.breed);
       dog.setBreed("Labrodor");
       System.out.println(dog.getBreed());


       Dog dog2 = new Dog("Pluto","Shitzu",1,"brown");
       dog2.animalName = "Dog";
       System.out.println(dog2.getName()+" "+dog2.animalName+" "+dog2.breed);

       Dog dog3 = new Dog("Rocky");
       System.out.println(dog3.getName());

       Animal animal = new Animal();
       animal.animalName = "Dog";


       Animal animal1 = new Dog();
       // animal1 object cannot access methods which belong only to Dog class
       //animal1.getBreed();

        String name = "Learning Pacakges";
        MyClass obj = new MyClass();
        obj.printNames(name);
        //cannot access the protected field 'name' from here

        animal.setNamesFromParentClass("setting parent data field from the child object");
        System.out.println(animal.getNamesFromParentClass());

    }
}

class Dog extends Animal
{
   String name;
  // private
   String breed;
   int age;
   String color;
   public Dog()
   {
     // System.out.println("I am inside constructor");
   }
   public Dog(String name,String breed,int age,String color)
   {
       this.name = name;
       this.breed = breed;
       this.age = age;
       this.color = color;
   }

   public Dog(String name)
   {
       this.name = name;
   }

    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public String getColor()
    {
        return color;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

}


