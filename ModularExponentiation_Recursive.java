import java.io.*;
public class ModularExponentiation_Recursive {
    // Recursive Java program
// to compute modular power

    /*
    Property 1:
        (m * n) % p has a very interesting property:
        (m * n) % p =((m % p) * (n % p)) % p
    Property 2:
        if b is even:
        (a ^ b) % c = ((a ^ b/2) * (a ^ b/2))%c ?    suggests divide and conquer
        if b is odd:
        (a ^ b) % c = (a * (a ^( b-1))%c
    Property 3:
        If we have to return the mod of a negative number x whose absolute value is less than y:
        then (x + y) % y will do the trick
        Note:
        Also as the product of (a ^ b/2) * (a ^ b/2) and a * (a ^( b-1) may cause overflow, hence we must be careful about those scenarios
     */
        static int exponentMod(int A, int B, int C)
        {

            // Base cases
            if (A == 0)
                return 0;
            if (B == 0)
                return 1;

            // If B is even
            long y;
            if (B % 2 == 0)
            {
                y = exponentMod(A, B / 2, C);
                y = ((y%C) * (y%C)) % C;
            }

            // If B is odd
            else
            {
                y = A % C;
                y = (y * exponentMod(A, B - 1, C) % C) % C;
            }

            return  (int)y; //--> -6
                    //(int)((y + C) % C);//-->positive number  (-6+13)%13 = 7
        }

        // Driver Code
        public static void main(String args[])
        {
            int A = -2, B = 5, C = 13;
            System.out.println("Power is " +
                    exponentMod(A, B, C));
        }
    }




