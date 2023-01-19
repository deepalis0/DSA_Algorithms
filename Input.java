import java.util.Scanner;//folders -- packages
                         //files --classes
public class Input {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();//Reading input from your terminal
        System.out.println("Integer is :" + n);

        System.out.println("Enter a long : ");
        long l = sc.nextLong();
        System.out.println(l);

        System.out.println("Enter a double ");
        double d = sc.nextDouble();
        System.out.println(d);

        System.out.println("Enter a float: ");
        float f = sc.nextFloat();
        System.out.println(f);

        System.out.println("Enter string: ");
        String s = sc.next();
        System.out.println(s);

        //Strings are made of characters
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);//"a" --> 'a'
        System.out.println(c);

        System.out.println("Enter a boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println(b);

        System.out.println("-----------Typecasting-------");

        int a = 12;
        long longValue = a;
        System.out.println("The value of long:" + longValue);

        float f1 = 12.3f;
        System.out.println(f1);
        double doubleValue = f1;
        System.out.println(doubleValue);

        f1 = a;
        System.out.println("The value of f1 : " + f1);
        //automatic conversion from lower range to higher range Data Type;
        f1 = 12.0f;
        a = (int)f1;//  12
        System.out.println("The value of int :" +a);
        longValue = (long)doubleValue;
        System.out.println(longValue);




        /*
        boolean is a java primitive type whereas Boolean is an object/reference type that wraps a boolean

          Converting between primitives and objects like this is known as boxing/unboxing.
         */


    }
}
