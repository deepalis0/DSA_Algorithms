import java.util.Scanner;

public class Loops {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n = sc.nextInt();

        //running
        System.out.println("Running loop from 1 to n");
        for(int i = 1 ;i <=n ; i++)
        {
            System.out.println("Hi");
        }

        System.out.println("Running loop from 0 to n-1");
        for(int i=0;i<n;i++)
        {
            System.out.println("Hi");
        }

        System.out.println("Running loop from n to 0");
        for(int i=n;i>=0;i--)
        {
            System.out.println("Hi");
        }


        //Print 1 to n numbers

        //for loop
        System.out.println();
        System.out.println("Using For loop print numbers from 1 to n ");
        for(int i = 1 ;i <= n; ++i)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Using For loop print reverse numbers from n to 1 ");
        // n=4  4 3 2 1
        for(int i = n; i > 0 ; --i)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Using For loop add numbers from 1 to n ");
        //adding 1 to n numbers
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of 1 to n is : "+ sum);

        System.out.println();
        System.out.println();
        /*Patterns*/
        //Pattern1:
//        *****
//        *****
//        *****
//        *****
        System.out.println("Pattern 1 :");
        for (int i=1; i<=4;i++){
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Optimised version of Pattern 1");

        //optimize further using nested for-loop
        for (int i=1; i<=4;i++){
            for (int j=1;j<=5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        //Pattern 2
        /*
        *
        * *
        * * *
        * * * *
         */
        //1st row->1 star -> 3 spaces
        //2nd row ->2 star -> 2 spaces  and so on
        System.out.println("Pattern 2");
        for(int i=1;i<=4;i++)
        {
            for(int j= 1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        //Pattern 3
        /*
         ___*
         __**
         _***
         ****
         */
        //1st row has 3 spaces followed by 1 * ,
        // 2nd row has 2 spaces followed by 2 *
        //n lines ;spaces = n - line Number  ; *=line Number
        System.out.println("Pattern 3:");
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        //Pattern 4
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        System.out.println("Pattern 4:");
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        //Pattern 5
        /*
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */
        // line 1   1 to 5   n-0
        //i=0  5-0 = 5    1 2 3 4 5
        //i=1  5-1 = 4    1 2 3 4
        System.out.println("Pattern 5:");
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        //Pattern 6 - Floyd's triangle
        /*
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         */
        System.out.println("Pattern 6:");
        int value = 1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1 ;j<=i;j++)
            {
                System.out.print(value++ +" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");
        //Pattern 7 - Butterfly pattern
        /*
        n = 5
         *                  *
         * *              * *
         * * *          * * *
         * * * *      * * * *
         * * * * *  * * * * *
         * * * * *  * * * * *
         * * * *      * * * *
         * * *          * * *
         * *              * *
         *                  *

         */

        System.out.println("Pattern 7:");
        System.out.println("Give input for Butterfly pattern:");
        n = sc.nextInt();
        // This is upper half of pattern
        //dvided into 3 parts , part1 is * on LHS  part2 is space and part3 is * on RHS
        //for n=5 , we have total 2n columns.
        //for i=1 part1 has i * , followed by part 2 = 2n - 2i spaces and part 3 has i *

        //for upper half of the pattern:
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            int spaces = 2*n -(2*i);
            for(int k=1;k<=spaces;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();

        }
        //for lower half of pattern
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            int spaces = 2*n - (2*(n-i));
            for(int k=1;k<=spaces;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();

        }

        System.out.println("-------------------------------------------------");
        //Pattern 8 - Palindromic Pattern
        /*
            _ _ _ _ 1 _ _ _ _
            _ _ 3 2 1 2 3 _ _
            _ 4 3 2 1 2 3 4 _
            5 4 3 2 1 2 3 4 5

         */
        //for n rows, cols : 2*n-1
        //spaces = 2*n-1 - 1 , 2*n-1 - 3, 2*n-1 -5 ..increment of 2
        System.out.println("Pattern 8:");
        System.out.println("Give input for Palindromic pattern:");
        n = sc.nextInt();
        int k = 1;
        for(int i=1;i<=n;i++)
        {
            int spaces = (2*n-1) - k;
            for(int j=1;j<=spaces/2;j++)
            {
                System.out.print("  ");
            }
            //2 1
            for(int l=i;l>=1;l--)
            {
                System.out.print(l+" ");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l+" ");
            }

            for(int j=1;j<=spaces/2;j++)
            {
                System.out.print("  ");
            }
            System.out.println();
            k+=2;

        }

        System.out.println("-------------------------------------------------");
        System.out.println("Pattern 9:");
        System.out.println("Give input for pattern 9:");
        n = sc.nextInt();
        for (int i=n; i>0; i--)
        {
            for(int j=n;j>0;j--)
            {
                for(k=0;k<i;k++)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");
        //while loop
        System.out.println();
        System.out.println("Using while loop:");
        int i = 1;
        while(i<=n)
        {
            System.out.print(i+" ");
            i++;
        }

        //do while loop
        System.out.println();
        System.out.println("Using do-while loop:");
        i = 0;
        do
        {
            System.out.print(i+" ");
            i++;
        }while(i<=n);


    }
}
