package package1;

public class demo {

    void display()
    {
        System.out.println(" inside default method - package1.demo ");
    }

    public void publicDisplayMethod()
    {
        System.out.println(" inside public method - package1.demo ");
    }

    private void privateDisplayMethod()
    {
        System.out.println(" inside private method - package1.demo ");
    }

    protected void protectedDisplayMethod()
    {
        System.out.println(" inside protected method - package1.demo ");
    }

    public static void main(String[] args)
    {
        demo d = new demo();
        d.publicDisplayMethod();
        d.protectedDisplayMethod();

    }


}
