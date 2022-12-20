public class Main {

    public static void main(String args[])
    {
        int x = 19;
        int y = 20;
        int sum = x  + y;
        System.out.println( "The sum of " + x + " and " + y + " is: " + sum   );

        int a ;
        a = 19;
        a = 20;
        System.out.println(a);

        float f = 10.12f;
        System.out.println(f);

        double d = 10.123;
        System.out.println(d);

        boolean value = true;
        System.out.println(value);

        boolean Value = false;
        System.out.println(Value);

        String s = "12";
        System.out.println(s);

        char c = '$';
        System.out.println(c);


        float n = 5.2f;

        // automatically appends zero to the rightmost part of decimal
        System.out.printf("Formatted to "+ "specific width: n = %.4f\n",n);

        n = 2324435.3f;

        // here number is formatted from right margin and occupies a width of 20 characters
        System.out.printf("Formatted to "+ "right margin: n = %20.4f\n",n);

        double decimal = 12.78;
        System.out.println(decimal);
        System.out.printf("%30.3f",decimal);
        System.out.println("---------------");


        System.out.printf("%2.4f",decimal);

       // System.out.printf("%.3f",decimal);

        x = 100;
        System.out.printf("Printing simple"+ " integer: x = %d\n",x);









    }
}

/*


 */
