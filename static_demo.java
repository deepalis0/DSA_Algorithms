public class static_demo {
    static int a;
    String msg;
    static
    {
      System.out.println("Inside static block!!");
      static_demo.a = 12;
      static_demo d = new static_demo();
      d.msg = "Hello There!";
      System.out.println(d.msg);

    }

    public static void main(String[] args)
    {
        static_demo obj = new static_demo();
        System.out.println(static_demo.a+" "+obj.msg);
    }

}
