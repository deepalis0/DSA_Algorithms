import AccessModifier_myPackage.MyClass;

public class childClassOfMyClass extends MyClass {

    String childName;
    public childClassOfMyClass()
    {
        this.childName = super.name;
    }

}
