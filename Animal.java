import AccessModifier_myPackage.MyClass;
public class Animal extends MyClass {
    protected String animalName;
    String color;

    public Animal() {

    }

    public String getName() {
        return animalName;
    }

    public String getColor() {
        return color;
    }

    public String getNamesFromParentClass()
    {
        return name;
    }

    public void setNamesFromParentClass(String name)
    {
        this.name = name;
    }

}
