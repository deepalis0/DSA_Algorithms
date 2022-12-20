public class Operators {

        public static void main(String args[]){

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
            System.out.println(b);
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

            // << Left shift
            //   >> signed right shift
            //  >>> unsigned right shift
            System.out.println(10<<2);//10*2^2=10*4=40
            //For positive number, >> and >>> works same
            System.out.println(20>>2);
            System.out.println(20>>>2);
            //For negative number, >>> changes parity bit (MSB) to 0
            System.out.println(-20>>2);
            System.out.println(-20>>>2);

            System.out.println(-8>>2);
            System.out.println(-8>>>2);


            // 1111 1111 1111 1111 1111 1111 1110 1100 --2s complement representation of -20
            //00(added these 2 zeroes)  1111 1111 1111 1111 1111 1111 1110 11 --> unsigned right shift by 2 on 2's complement

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

            int x1 = 12;
            int y1 = 25;
            int c2 = x1 | y1;
            System.out.println(c2);
            int c3 = x1 & y1;
            System.out.println(c3);
            System.out.println(~8);

        }
}


//https://www.rapidtables.com/convert/number/decimal-to-binary.html