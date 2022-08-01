import java.util.Scanner;

public class Loops {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n = sc.nextInt();

        for(int i = 1 ;i <=n ; i++)
        {
            System.out.println("Hi");
        }

        //Print 1 to n numbers

        //for loop
        System.out.println();
        System.out.println("Using For loop:");
        for(int i = 1 ;i <= n; ++i)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        // n=4  4 3 2 1
        for(int i = n; i > 0 ; --i)
        {
            System.out.print(i+" ");
        }

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
