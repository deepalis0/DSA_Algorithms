import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array : ");
//        int n = sc.nextInt();
//
//        int[] a = new int[n]; //created a 1-D array of size n of type int
//        //n = 4 , indices : 0, 1, 2, 3
//        System.out.println("Print default values of array: ");
//        display(a);
//        System.out.println("Enter values for the  array : ");
//        for(int i = 0 ;i< n ;i ++)
//        {
//            System.out.println("Enter value: ");
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Displaying values for array: ");
//        display(a);
//
//        System.out.println("Displaying values for array in reverse order: ");
//        displayInRev(a);

//        System.out.println("Enter values for the 2-D array : ");
//        System.out.println("Enter number of rows : ");
//        int rows = sc.nextInt();
//        System.out.println("Enter number of cols : ");
//        int cols = sc.nextInt();
//        int b[][] = new int[rows][cols];
//        //int[][] b
//        for(int i=0;i<rows;i++)
//        {
//            for(int j=0;j<cols;j++)
//            {
//                System.out.println("Enter value: ");
//                b[i][j] = sc.nextInt();
//            }
//
//        }
//        System.out.println("Displaying values for 2-D array: ");
//        for(int i=0;i<rows;i++)
//        {
//            for(int j=0;j<cols;j++)
//            {
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<rows;i++)
//        {
//            display(b[i]);
//        }


//        int c[][][] = new int[2][][];
//        for(int i =0;i<2;i++)
//        {
//            c[i] = b;
//        }
//        System.out.println("Displaying values for 3-D array: ");
//        for(int i=0;i<2;i++) {
//            for (int j = 0; j < rows; j++) {
//                for(int k=0;k<cols;k++)
//                {
//                    System.out.print(c[i][j][k]+" ");
//                }
//                System.out.print(";");
//            }
//            System.out.println();
//        }

        int x = 36;
        boolean isPrime = isPrime(x);
        if(isPrime)
           System.out.println(x + " is a prime number");
        else
           System.out.println(x + " is not a prime number");


    }
    // Suppose we write the factors of 36.
    //1,2,3,4,6,9,12,18,36
    //checking factors till n/2 , as there wont be any factor between sqrt(n) and n which we would miss!
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1) return false;

        // Check from 2 to n-1
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                return false;
        }

        return true;
    }
     static void display(int[] a)
    {
        for(int i = 0;i<a.length ;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    static void displayInRev(int[] a)
    {
        for(int i = a.length-1 ;i>=0 ;i--)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
