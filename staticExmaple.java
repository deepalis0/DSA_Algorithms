public class staticExmaple {

    static int a;
    int b; // non - static


    public staticExmaple(int b)
    {
        this.b = b;
    }

    public int getA()
    {

        return a;
    }

    static void display()
    {

        System.out.println("Hello! I am inside static method");
    }

    //static blocks
    static {
        System.out.println("I am inside FIRST static block");
        display();
        a = 1;
    }

    static {

        System.out.println("I am inside SECOND static block");
    }
    public static void main(String[] args)
    {
        staticExmaple obj1 = new staticExmaple(12);
        staticExmaple obj2 = new staticExmaple(12);
        staticExmaple.a = 12;
//        obj1.a = 12;
        //staticExmaple.a = 12;
        a++;
        System.out.println(obj1.a+" "+obj2.a+" "+staticExmaple.a);
        //obj.a --> 13
        //obj2.a --> 13
        //staticExample.a --> 13
        obj1.b++;
        obj2.b--;
        System.out.println(obj1.b+" "+obj2.b);
        // obj1 --> b = 13
        //obj2 --> b = 11

        staticExmaple.display();

    }

}
//https://www.geeksforgeeks.org/static-class-in-java/
//https://www.baeldung.com/java-static