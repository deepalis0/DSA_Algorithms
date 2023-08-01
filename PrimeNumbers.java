import java.util.Arrays;
import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();//30

        boolean[] bool = new boolean[num+1];// 0 to num 0 to 30
        //all are prime numbers to start with
        Arrays.fill(bool, true);
        /*
        for (int i = 0; i< bool.length; i++) {
            bool[i] = true;
        }
         */
        for (int i = 2; i<= Math.sqrt(num); i++)
        {
            if(bool[i])//if i is prime
            {
                for(int j = (i*i); j<=num; j = j+i)//marking all multiples of i as Non-Primes
                {
                    bool[j] = false;
                }
            }
        }
        System.out.println("List of prime numbers including n are : ");
        for (int i = 2; i< bool.length; i++)
        {
            if(bool[i]) {
                System.out.println(i);
            }
        }
    }
}


