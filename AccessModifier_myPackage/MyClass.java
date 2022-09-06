package AccessModifier_myPackage;

public class MyClass {

    private int a;
    protected String name;
    public int value;
    public void printNames(String s)
    {
        System.out.println(s + a);

    }

    public void setA(int x)
    {
        this.a = x;
    }

    public int getA()
    {
        return this.a;
    }

    public void setValue(int x)
    {
        value = x;
    }
    public int getValue()
    {
        return value;
    }
    public String getName()
    {
        return name;
    }
    protected void setName(String s)
    {
        this.name = s;
    }

}
// for protected access modifier : https://stackoverflow.com/questions/19949327/why-subclass-in-another-package-cannot-access-a-protected-method