package AccessModifier_myPackage;

public class Main {
    public static  void main(String[] args)
    {
        NewClass newClass = new NewClass();
        newClass.newClassProperty = "test";
        System.out.println(newClass.getNewClassProperty());


        MyClass myClass = new MyClass();
        myClass.value = 12;
        myClass.name = "xyz";
        System.out.println(myClass.getValue()+" "+myClass.name);
        myClass.setName("xyz");
        //myClass.a = 12
        myClass.setA(12);
        myClass.getA();

        childClass childClass = new childClass();
        childClass.name = "test";


    }
}

class childClass extends MyClass
{

}
