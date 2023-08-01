import java.util.Scanner;

public class Loops {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=2;i<=n;i=i+2)// i+=2
        {
            sum += i;
        }
        System.out.println("The sum of even numbers : "+ sum);

        //running
        System.out.println("Running loop from 1 to n");
        for(int i = 1 ;i <=n ; i++)
        {
            System.out.println("Hi");
        }

        System.out.println("Running loop from 0 to n-1");
        for(int i=0;i<n;i++)//n times n=4 0 1 2 3
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
        for(int i = 1 ;i <= n; ++i)//i++
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
         sum = 0;
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
        for (int i=1; i<=4;i++)//4 lines
        {
            for (int j=1;j<=5;j++) {
                System.out.print("*");
            }// *****

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
        System.out.println("Enter n :");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            //spaces , row number i, total spaces for ith row = 4-i
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");//2spaces
            }
            for(int j=1;j<=i;j++)//i times
            {
                System.out.print(" *");//space followed by *
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
        for(int i=1;i<=5;i++)//total no. of rows
        {
            //i=2
            for(int j=1;j<=i;j++)// j = 1 2
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
        for(int i=0;i<5;i++)//0 <5  , 0 1 2 3 4
        {
            for(int j=1;j<=5-i;j++)//5-1= 4   1 2 3 4
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        //Pattern 6 - Floyd's triangle
        /*
         1
         2 3//for loop
         4 5 6
         7 8 9 10
         11 12 13 14 15
         */
        System.out.println("Pattern 6:");
        int value = 1;
        for(int i=1;i<=10;i++) // Number of lines
        {
            for(int j=1 ;j<=i;j++)//i times
            {
                System.out.print(value++ +" ");
                //value = value + 1;
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
                System.out.print("  ");//2 spaces
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

        //for lower half of pattern
        for(int i=0;i<n;i++)//5 lines
        {
//              i=0     1st -- 5 5             n-i 5-0=5
//              i=1    2nd line -- 4 space 4   n-i 5-1=4
            for(int j=1;j<=n-i;j++)//5
            {
                System.out.print("* ");
            }
            int spaces = 2*n - (2*(n-i));//n=5 col=10
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
        /* n=5 cols= 2*n-1
            _ _ _ _ 1 _ _ _ _
            _ _ _ 2 1 2 _ _ _
            _ _ 3 2 1 2 3 _ _
            _ 4 3 2 1 2 3 4 _
            5 4 3 2 1 2 3 4 5

         */
        //for n rows, cols : 2*n-1
        //spaces = 2*n-1 - 1 , 2*n-1 - 3, 2*n-1 -5 ..increment of 2
        System.out.println("Pattern 8:");
        System.out.println("Give input for Palindromic pattern:");
        n = sc.nextInt();
        int k = 1;//numbers in every row, 1 3 5 7 9...
        for(int i=1;i<=n;i++)
        {
            int spaces = (2*n-1) - k;// n=4 7 - 1= 6
            for(int j=1;j<=spaces/2;j++)
            {
                System.out.print("  ");
            }
            //3 2 1
            for(int l=i;l>=1;l--)
            {
                System.out.print(l+" ");
            }
            //2 3
            for(int l=2;l<=i;l++)
            {
                System.out.print(l+" ");
            }

//            for(int j=1;j<=spaces/2;j++)
//            {
//                System.out.print("  ");
//            }
            System.out.println();
            k+=2;//k = k + 2

        }

        System.out.println("-------------------------------------------------");
        System.out.println("Pattern 9:");
        System.out.println("Give input for pattern 9:");
        n = sc.nextInt();
//        n=3
//             i=3  3 3 3 2 2 2 1 1 1   j:(3 2 1 )
//             i=2  3 3 2 2 1 1    j:(3 2 1)
//             i=1  3 2 1              j:(3 2 1)
        for (int i=n; i>0; i--)// row number in reverse
        {
            for(int j=n;j>0;j--)//what numbers to print in ith row
            {
                for(k=0;k<i;k++)//how many times to print a number -->i times
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
        System.out.println("Give input for while");
        n = sc.nextInt();
        int i = 1;
        while(i<=n)
        {
            System.out.print(i+" ");
            i++;
        }

        //Program for adding two numbers with test case
        System.out.println();
        System.out.println("Enter the value of Test Case");
        int t = sc.nextInt();//4
        while(t>0)//4 times 4 3 2 1
        {
            t--;
            System.out.println("Enter value of 1stNumber");
            int a = sc.nextInt();
            System.out.println("Enter value of 2ndNumber");
            int b = sc.nextInt();
            sum = a + b;
            System.out.println("The sum is :"+sum);
        }

//        for( i=1;i<=t;i++)
//        {
//            System.out.println("Enter value of 1stNumber");
//            int a = sc.nextInt();
//            System.out.println("Enter value of 2ndNumber");
//            int b = sc.nextInt();
//            sum = a + b;
//            System.out.println("The sum is :"+sum);
//        }

        //do while loop
        System.out.println();
        System.out.println("Using do-while loop:");
        i = 0;
        do
        {
            System.out.print(i+" ");
            i++;
        }while(i<=n);

        /*
        Why use do-while?
A do-while loop is used where your loop should execute at least one time.
For example, let’s say you want to take an integer input from the user until the user has entered a positive number. In this case, we will use a do-while as we have to run the loop at-least once. The loop takes an initial input, and it will continue running until the user enters a positive number.
         */
        System.out.println("-------------------------------------------------");
        System.out.println("Application of do-while loop:");
        int input;
        do {
            System.out.println("Enter a positive number :");
            input = sc.nextInt();
        }while(input>0);

//        System.out.println("Enter a positive number :");
//        input = sc.nextInt();
//        while(input>0)
//        {
//            System.out.println("Enter a positive number :");
//            input = sc.nextInt();
//        }


    }
}
