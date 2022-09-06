import java.util.Scanner;
import java.lang.String;

public class Strings {

    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        //String s = sc.next();

        String x = "Hello";
        char a[] = x.toCharArray();

        System.out.println( x.charAt(2) ); // output is 'l'

        x = x.concat(" world");
        System.out.println(x);

        String y = "Exit";

        System.out.println( y.equalsIgnoreCase("EXIT")); // is "true"

        System.out.println( y.equals("exit")); // is "false"

        System.out.println( x.length() );

        x = "oxoxoxox";

        System.out.println( x.replace('x', 'X') ); // output is  "oXoXoXoX"

        x = "0123456789";                 // the value of each char is the same as its index!

        System.out.println( x.substring(5) );    // output is "56789"

        System.out.println( x.substring(5, 8));  // output is "567"

        x = "A New Java Book";

        System.out.println( x.toLowerCase() ); // output is "a new java book"
        System.out.println( x.toUpperCase() );

        System.out.println("The strings is :"+x);
        System.out.println(x.contains("Amit")); // This will print false

        System.out.println(x.contains("JAVA"));
        System.out.println(x.contains("Java"));

        x = "abbbacdd";
        System.out.println("First occurrence of a is " + x.indexOf('a'));
        System.out.println("Last occurrence of a is " + x.lastIndexOf('a'));

        System.out.println("Last occurrence of a is " + x.lastIndexOf('a',5));

        System.out.println("First occurrence of a is " + x.indexOf('a',5));

        /*
         compareTo() method
        It returns the following values:

        if (string1 > string2) it returns a positive value.
        if both the strings are equal lexicographically, i.e.(string1 == string2) it returns 0.
        if (string1 < string2) it returns a negative value.
         */

        String s1 = "Arun";

        String s2 = "Ram";

        String s3 = "Arun";

        String s4 = "ABC";


        System.out.println(" Comparing strings with compareTo:");

        System.out.println(s1.compareTo(s2));

        System.out.println(s1.compareTo(s3));

        System.out.println(s1.compareTo(s4));


    }

}
