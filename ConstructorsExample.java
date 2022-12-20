public class ConstructorsExample {
    int x;
    String msg;
    int y;

    static int count;
    //Parameterized Constructor
    public ConstructorsExample(int x,String s)
    {
        this.x = x;
        this.msg = s; //msg = s;
    }
    public ConstructorsExample()
    {

    }
    public ConstructorsExample(int a,int b,String s)
    {
        this.x = a;
        y = b;
        msg = s;
    }
    public static void main(String[] args)
    {
        ConstructorsExample obj1 = new ConstructorsExample();//call to a DEFAULT constructor
        ConstructorsExample obj2 = new ConstructorsExample(12,"Hi!");
        ConstructorsExample obj3 = new ConstructorsExample(12,13,"Hello");
        ConstructorsExample.count = 12;
    }

}
