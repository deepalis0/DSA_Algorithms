import AccessModifier_myPackage.*;

public class AccessModifier_Main extends MyClass {

    public static void main(String[] args)
    {
        NewClass newClass = new NewClass();
        //newClass.newClassProperty = "test"; // as newClassProperty is default
        newClass.setNewClassProperty("test");
        System.out.println(newClass.getNewClassProperty());


        MyClass myClass = new MyClass();
        myClass.value = 12; //can be accessed as value is public
        // myClass.name = "xyz"; //as name is not public and protected is accessed via subclass if outside package
        //myClass.setName("xyz"); only public methods/variables can be called on class objects

        System.out.println(myClass.getValue()+" "+myClass.getName());

       AccessModifier_Main d = new AccessModifier_Main();
       d.name = "abc";
       System.out.println(d.getValue()+" "+d.getName());
       d.setName("xyz");

       d.doNow();

    }

    public void doNow()
    {
        MyClass myclass = new MyClass();
        myclass.value = 13;
        name = "xyz";
        setName("test");
        System.out.println(getName());
    }
}
/*
Public -- > Accessible by all classes in application
Default --> Accessible by all classes inside the same
package.

Private --> Accessible only within the same class.So, you need
getters and setters to access the private variables using the object
outside the class


Protected-->Accessible by subclasses inside and outside the
package.
This behaves similar to default for classes inside the same
package.
For accessing outside the package, this can be accessible only
via subclass objects!
*/





