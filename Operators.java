public class Operators {

        public static void main(String args[]){

        System.out.print("Hello World");
        System.out.println("Hi");
        System.out.println("bye");


            int x = 14;
            int y =  20;

            int sum = x + y;
            System.out.println("The sum is " + sum);

            int difference = y - x;
            System.out.println("The difference is " + difference);

            int product = x * y;
            System.out.println("The product is " + product);

            int division = y/x;
            System.out.println("The integer division is " + division);

            double div = y/x;
            System.out.println("The division when both are integers is " + div);

            double d = (double)y/x;
            System.out.println("The division is " + d);

            float f = (float)y/x;
            System.out.println("The division is " + f);


            x = 5;
            int mod = y % x;
            System.out.println("The mod is " + mod);


            int a=10;
            int b=10;
            // ++ --
            System.out.println("Unary Operators.......");
            System.out.println(a++ + ++a);//10+12=22
            System.out.println(b++ + b++);//10+11=21
            System.out.println(b);//b = 12
            b++;
            ++b;

            // unary -
            a = 5;
            System.out.println(a);
            System.out.println(-a);

            //!
            boolean isValid =false;
            System.out.println(isValid);
            System.out.println(!isValid);
            boolean b1 = !isValid;
            System.out.println(!b1);

            System.out.println("------Shift Operators--------");
            // << Left shift
            //   >> signed right shift
            //  >>> unsigned right shift
            System.out.println(10<<2);//10 * 2^2=10*4=40
            //For positive number, >> and >>> works same
            System.out.println(20>>2); // 20 / 2^2 =
            System.out.println(20>>>2); // 20 / 2 ^2
            //For negative number, >>> changes parity bit (MSB) to 0
            System.out.println(-20>>2);
            System.out.println(-20>>>2);

            System.out.println(-8>>2);//signed right
            System.out.println(-8>>>2);//unsigned right


            // 1111 1111 1111 1111 1111 1111 1110 1100 --2s complement representation of -20
            //00(added these 2 zeroes)  1111 1111 1111 1111 1111 1111 1110 11 --> unsigned right shift by 2 on 2's complement

//
//             a = 5;          //  00000000000000000000000000000101
//             b = 2;          //  00000000000000000000000000000010
//             c = -5;         //  11111111111111111111111111111011
//
//            (a >>> b); //  00000000000000000000000000000001
//            // Expected output: 1
//
//            (c >>> b); //  00111111111111111111111111111110
//            // Expected output: 1073741822


            //Logical and Bitwise Operators:

            a=10;
            b=5;
            int c=20;
            System.out.println(a>b||a<c);//true || true = true
            System.out.println(a>b|a<c);//true | true = true
//|| vs |
            System.out.println(a>b||a++<c);//true || true = true
            System.out.println(a);//10 because second condition is not checked
            System.out.println(a>b|a++<c);//true | true = true
            System.out.println(a);//11 because second condition is checked

            //Bitwise Operators
            int x1 = 12;
            int y1 = 25;
            System.out.println(x1 +" "+ Integer.toBinaryString(x1));
            System.out.println(y1+" " +Integer.toBinaryString(y1));
            int c2 = x1 | y1;
            System.out.println(c2);
            System.out.println(Integer.parseInt("11101",2));
            int c3 = x1 & y1;
            System.out.println(c3);

            int c4 = x1 ^ y1;
            System.out.println(c4);

            //System.out.println(-8+" " +Integer.toBinaryString(-8));
            System.out.println(-9+" " +Integer.toBinaryString(-9));
            System.out.println( 8+" " +Integer.toBinaryString(8));
            System.out.println(~8);// 8 --> 0000000001000  -8 11111111000
            // ~a = -(a+1)
            System.out.println(12 + ~8 + 1);// 12 -9 + 1
        }
}

/*
     Associativity:
     2 ^ 2 ^ 3 is treated as 2 ^ (2 ^ 3) as ^ has right to left associativity
 */


/*
Typecasting in Java:
For higher to lower ,needs to be mentioned explicitly:
 https://www.baeldung.com/java-integer-division-float-result
https://stackoverflow.com/questions/71185797/storing-result-of-multiplication-of-two-integers-in-long
Lec4 
 */
//https://www.rapidtables.com/convert/number/decimal-to-binary.html

/*
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.
 */