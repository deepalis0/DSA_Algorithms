import java.util.*;
public class Input {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
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

        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println(c);

        System.out.println("Enter a boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println(b);
    }
}
